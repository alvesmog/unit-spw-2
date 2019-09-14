package aula3_sistema_farmacia;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String cpf;
	
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	void cadastrarCliente(String nome, String cpf) {
		
		Cliente c = new Cliente();
		
		c.nome = nome;
		c.cpf = cpf;
		
		clientes.add(c);
		
	}
	
}
