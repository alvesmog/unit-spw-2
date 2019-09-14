package aula3_sistema_farmacia;

import java.util.ArrayList;

public class Produto {
	
	private float preco;
	private float estoque;
	private String descricao;
	private String tipo;
		//0 - fralda
		//1 - remédio
		//2 - perfumaria
		//3 - lenço umidecido
	private String validade;
	
	Fornecedor fornecedor;
	
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	void cadastrarProduto(float preco, float estoque, String descricao, String tipo, String validade) {
		
		Produto p = new Produto();
		p.preco = preco;
		p.estoque = estoque;
		p.descricao = descricao;
		p.tipo = tipo;
		p.validade = validade;
		
		produtos.add(p);
	}
}
