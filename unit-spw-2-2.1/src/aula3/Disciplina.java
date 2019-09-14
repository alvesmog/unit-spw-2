package aula3;

import java.util.ArrayList;

public class Disciplina {
	String nome;
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	int QTD_MAX_ALUNOS = 30;
	
	void adicionarAluno(Aluno matricula) {
		alunos.add(matricula);
	}
}
