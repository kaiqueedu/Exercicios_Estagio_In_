package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import models.Aluno;
import utils.GerenciadorPool;

public class AlunoDao {

	private DataSource ds;

	public AlunoDao() {
		ds = GerenciadorPool.getInstance().getDataSource();
	}

	public void insert(Aluno aluno) {

		String sql = "insert into Aluno(id,nome,idade) values(?,?,?)";

		try (Connection con = ds.getConnection(); 
			PreparedStatement pStat = con.prepareStatement(sql)) {
			pStat.setInt(1, aluno.getId());
			pStat.setString(2, aluno.getNome());
			pStat.setInt(3, aluno.getIdade());

			pStat.executeUpdate();

		} catch (SQLException erro) {
			erro.printStackTrace();
			throw new RuntimeException(erro);
		}
	}
	
	public void delete(int id) {
		
		String sql = "delete from aluno where id = ?";
		
		try( Connection con = ds.getConnection();
			PreparedStatement pStat = con.prepareStatement(sql) ) {
			
			pStat.setInt(1, id);
			pStat.executeUpdate();
			
		}catch(SQLException erro) {
			erro.printStackTrace();
			throw new RuntimeException(erro);
		}
	}
	
	public void update(Aluno aluno) {
		
		String sql = "update aluno set nome = ?, idade = ? where id = ?";
		
		try( Connection con = ds.getConnection();
			PreparedStatement pStat = con.prepareStatement(sql) ) {
		
			pStat.setString(1, aluno.getNome());
			pStat.setInt(2, aluno.getIdade());
			pStat.setInt(3, aluno.getId());
			
			pStat.executeUpdate();
			
		}catch(SQLException erro) {
			erro.printStackTrace();
			throw new RuntimeException(erro);
		}
	}
	
	public List<Aluno> selectAll() {

		List<Aluno> list = new ArrayList<Aluno>();
		String sql = "select * from aluno";
		
		try( Connection con = ds.getConnection();
			PreparedStatement pStat = con.prepareStatement(sql); ) {
		
			ResultSet rs = pStat.executeQuery();
			
			while( rs.next() ){
				list.add( new Aluno( rs.getInt("id"),
									 rs.getString("nome"),
									 rs.getInt("idade") ) ); 
			}
			
		}catch(SQLException erro) {
			erro.printStackTrace();
			throw new RuntimeException(erro);
		}
		
		return list;
	}
	
	
	public Aluno selectById(int id) {
		
		String sql = "select * from aluno where id = ?";
		Aluno aluno = new Aluno();
		
		try( Connection con = ds.getConnection();
			PreparedStatement pStat = con.prepareStatement(sql); ) {
			
			pStat.setInt(1, id);
			ResultSet rs = pStat.executeQuery();
			
			if( rs.next() ) {
				aluno = new Aluno(  rs.getInt("id"),
									rs.getString("nome"),
									rs.getInt("idade") );
			}
			
			
		}catch(SQLException erro) {
			erro.printStackTrace();
			throw new RuntimeException(erro);
		}
		return aluno;
	}

}
