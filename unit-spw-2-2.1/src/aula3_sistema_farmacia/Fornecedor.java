package aula3_sistema_farmacia;

import java.util.ArrayList;

public class Fornecedor {
	protected String nome;
	private String cnpj;
	
	public static ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	
	void cadastrarFornecedor(String nome, String cnpj) {
		
		Fornecedor f = new Fornecedor();
		f.nome = nome;
		f.cnpj = cnpj;
		
		fornecedores.add(f);
	}
	
}
