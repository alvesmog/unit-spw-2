package aula3_sistema_farmacia;

import java.util.ArrayList;

public class Funcionario {
	String nome;
	int cargo;
		//0 - gerente
		//1 - caixa
		//2 - balcao
		//3 - farmaceutico
	String usuario; //Geralmente é o cpf, matricula, etc
	String senha;
	
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	void cadastrarFuncionario(String nome, int cargo, String usuario, String senha) {
		
		//Funcionario f = new Funcionario();
		this.nome = nome;
		this.cargo = cargo;
		this.usuario = usuario;
		this.senha = senha;
		
		funcionarios.add(this);
		
	}
	
}
