package aula3;

public class Main {

	public static void main(String[] args) {
		
		//int x = 10; //Int é um tipo primitivo. Tipos primitivos são instanciados sem precisar da palavra "new": "int x = new int()" -> não precisa ser assim
		
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
		d1.alunos.add(a1);
		d1.alunos.add(a2);
		
		Disciplina d2 = new Disciplina();
		d2.nome = "Programação 2";
		d2.alunos.add(a1);

		//Turma
		
		Turma t1 = new Turma();
		t1.identificador = 001;
		t1.descricao = "SPW";	
		t1.disciplinas.add(d1);
		t1.disciplinas.add(d2);
		/*
		//Imprimindo Manualmente
		System.out.println("Imprimindo aluno e turma manualmente: ");
		System.out.println("");
		System.out.println("Nome = " + a1.nome);
		System.out.println("Nome = " + a1.matricula);
		System.out.println("Nome = " + a1.cpf);
		System.out.println("Identificador da turma: " + t1.identificador);
		System.out.println("Descricao da turma: " + t1.descricao);
		System.out.println("");
		System.out.println("----------------------------------------------------------------");
		System.out.println("");
		
		//Imprimindo no "for"
		System.out.println("Imprimindo aluno e turma utilizando um loop: ");
		System.out.println("");
		for(int i=0; i < t1.disciplina.size() ; i++) {
			Disciplina dAux = t1.disciplinas.get(0);
			System.out.println("Nome da disciplina = " + t1.disciplina.get(i).nome + " | Nome dos alunos: " + t1.disciplina.get(i).alunos.get(i).nome);
		}*/
		
		for(int i=0;i<t1.disciplinas.size();i++) {
			Disciplina dAux = t1.disciplinas.get(i);
			
			System.out.println("Disciplina = " + dAux.nome);
			
			System.out.print("Alunos = ");
			for(int j=0 ; j<dAux.alunos.size(); j=j+1) {
				if (j<dAux.alunos.size()-1) {
					System.out.print(dAux.alunos.get(j).nome+", ");	
				} else {
					System.out.print(dAux.alunos.get(j).nome+".");
					System.out.println("");
					System.out.println("--------------------------");
					System.out.println("");
				}
			}
		}
	}
}
