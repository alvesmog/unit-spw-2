package aula3_sistema_farmacia;

public class Farmacia {

	public static void main(String[] args) {
		
		Fornecedor f = new Fornecedor();
		f.cadastrarFornecedor("meu fornecedor", "12.123.123/1234-12");
		
		Produto p = new Produto();
		p.cadastrarProduto(10, 11, "teste", "1", "01/01/2010", f);
		
		Funcionario func = new Funcionario();
		func.cadastrarFuncionario("Fulano", 0, "fulanologin", "fulano123");
		
		Cliente c = new Cliente();
		c.cadastrarCliente("Sicrado", "111.111.111-11");
		
		System.out.printf(Fornecedor.fornecedores.get(0).nome);

	}
}
