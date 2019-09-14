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
	
	void realizarVenda(String produto, String cliente, String funcionario, float preco) {
		
		Funcionario f  = new Funcionario();
		
		Venda v = new Venda();
		v.produto = produto;
		v.cliente = cliente;
		v.funcionario = f;
		
		System.out.printf("Produto vendido: " + v.produto);
		
		
	}
	
}
