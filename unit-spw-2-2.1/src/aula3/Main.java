package aula3;

public class Main {

	public static void main(String[] args) {
			
		//Alunos
		
		Aluno a1 = new Aluno(); //Aluno é um tipo não primitivo, que foi criado por nós na classe Aluno
		a1.nome = "Guilherme";
		a1.matricula = 001;
		a1.cpf = "000.111.222.33";
		
		Aluno a2 = new Aluno();
		a2.nome = "Carol";
		a2.matricula = 002;
		a2.cpf = "111.222.333.44";
		
		//Disciplina
		
		Disciplina d1 = new Disciplina();
		d1.nome = "Programação 1";
		d1.adicionarAluno(a1);
		d1.adicionarAluno(a2);

		
		Disciplina d2 = new Disciplina();
		d2.nome = "Programação 2";
		d2.adicionarAluno(a1);
		d2.adicionarAluno(a2);
		
		//Turma
		
		Turma t1 = new Turma();
		t1.identificador = 001;
		t1.descricao = "SPW";	
		t1.disciplinas.add(d1);
		t1.disciplinas.add(d2);

	}
}
