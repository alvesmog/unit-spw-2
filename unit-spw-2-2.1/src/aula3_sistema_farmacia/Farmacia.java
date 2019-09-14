package aula3_sistema_farmacia;

public class Farmacia {

	public static void main(String[] args) {
		
		//Cadastrar fornecedor
		Fornecedor f = new Fornecedor();
		f.cadastrarFornecedor("meu fornecedor", "12.123.123/1234-12");
		
		//Cadastrar produto
		Produto p = new Produto();
		p.cadastrarProduto(10, 11, "teste", "1", "01/01/2010", f);
		
		
		//Cadastrar funcionario
		Funcionario func = new Funcionario();
		func.cadastrarFuncionario("Fulano", 0, "fulanologin", "fulano123");
		
		//Cadastrar cliente
		Cliente c = new Cliente();
		c.cadastrarCliente("Sicrado", "111.111.111-11");
		
		//Vender
		Venda v = new Venda();
		
		System.out.printf(Fornecedor.fornecedores.get(0).nome);

	}
}
