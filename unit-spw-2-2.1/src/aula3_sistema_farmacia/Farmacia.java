package aula3_sistema_farmacia;

public class Farmacia {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("DADOS DE CADASTRO:");
		System.out.println("-----------------------------------------------------------------");
		
		//Cadastrar fornecedor
		Fornecedor f = new Fornecedor();
		f.cadastrarFornecedor("meu fornecedor 1", "12.123.123/1234-12");
		f.cadastrarFornecedor("meu fornecedor 2", "12.123.123/1234-12");
		
		System.out.println("Fornecedores cadastrados: ");
		for (int i=0; i<=Fornecedor.fornecedores.size()-1; i++) {
			System.out.println("-	" + Fornecedor.fornecedores.get(i).nome + ", CNPJ: " + Fornecedor.fornecedores.get(i).cnpj);
		}
		
		
		//Cadastrar produto
		Produto p = new Produto();
		p.cadastrarProduto(10, 11, "agua", "1", "01/01/2010", f);
		
		System.out.println("Produtos cadastrados: ");
		System.out.println("-	" + Produto.produtos.get(0).descricao);
		
		
		//Cadastrar funcionario
		Funcionario func = new Funcionario();
		func.cadastrarFuncionario("Fulano", 0, "fulanologin", "fulano123");
		
		//Cadastrar cliente
		Cliente c = new Cliente();
		c.cadastrarCliente("Sicrado", "111.111.111-11");
		
		//Vender
		System.out.println("");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("DADOS DE VENDA:");
		System.out.println("-----------------------------------------------------------------");
	
		func.realizarVenda("agua", "carol", "guilherme", 11);
		
		
		
	}
}
