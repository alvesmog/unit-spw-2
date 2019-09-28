package exercicio_petshop;

public class Main {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Cachorro c = new Cachorro();
		c.nome = "tobby";
		c.qtdPatas = 4;
		Gato g = new Gato();
		g.nome="bruce";
		g.qtdPatas = 4;
		Passaro p = new Passaro();
		p.nome="piu-piu";
		p.qtdPatas = 2;
		
		c.comunicar();
		g.comunicar();
//		g.comer();
		p.comunicar();
		
		ColecaoDeAnimais colecao = new ColecaoDeAnimais();
		
		colecao.adicionar(c);
		colecao.adicionar(g);
		colecao.adicionar(p);
		
		colecao.listar();
		
		colecao.remover(c);
		colecao.remover(g);
		colecao.listar();
		

		
	}

}
