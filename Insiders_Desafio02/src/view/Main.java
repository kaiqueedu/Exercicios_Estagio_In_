package view;

import daos.AlunoDao;
import models.Aluno;

public class Main {

	public static void main(String[] args) {
		
		AlunoDao dao = new AlunoDao();
		
		dao.insert(new Aluno(1, "Kaique Correa", 26));
		dao.insert(new Aluno(2, "Luana", 27));
		
		dao.update(new Aluno(1, "Kaique Eduardo Correa", 26));
		dao.delete(1);

		System.out.println( dao.selectById(1));
		
		for( Aluno a: dao.selectAll()) {
			System.out.println(a);
		}
		
	}
	
}

