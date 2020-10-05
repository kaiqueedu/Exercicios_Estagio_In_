package utils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class GerenciadorPool {

	private BasicDataSource ds;
	private static GerenciadorPool gp = new GerenciadorPool();

	private GerenciadorPool() {
		ds = new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("oracle");
	}

	public static GerenciadorPool getInstance() {
		return gp;
	}

	public BasicDataSource getDataSource() {
		return ds;
	}

	public boolean isConnectionOK() {
		try (Connection con = ds.getConnection()) {
			return true;
		} catch (SQLException erro) {
			return false;
		}
	}
	
}
