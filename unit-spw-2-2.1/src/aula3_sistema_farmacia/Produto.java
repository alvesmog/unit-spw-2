package aula3_sistema_farmacia;

import java.util.ArrayList;

public class Produto {
	
	protected float preco;
	protected float estoque;
	protected String descricao;
	protected String tipo;
		//0 - fralda
		//1 - remédio
		//2 - perfumaria
		//3 - lenço umidecido
	protected String validade;
	
	Fornecedor fornecedor;
	
	public static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	void cadastrarProduto(float preco, float estoque, String descricao, String tipo, String validade, Fornecedor fornecedor) {
		
		Produto p = new Produto();
		p.preco = preco;
		p.estoque = estoque;
		p.descricao = descricao;
		p.tipo = tipo;
		p.validade = validade;
		p.fornecedor = fornecedor;
		
		produtos.add(p);
	}
}
