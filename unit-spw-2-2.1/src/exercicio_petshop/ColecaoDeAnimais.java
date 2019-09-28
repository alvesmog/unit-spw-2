package exercicio_petshop;

import java.util.ArrayList;

public class ColecaoDeAnimais {
	
	static ArrayList<Animal> listaTodosAnimais = new ArrayList<Animal>();
	
	void listar() {
		for(int i=0;i<=ColecaoDeAnimais.listaTodosAnimais.size()-1;i++) {
			if (ColecaoDeAnimais.listaTodosAnimais.get(i).qtdPatas > 2) {
				System.out.println(ColecaoDeAnimais.listaTodosAnimais.get(i).nome);
			}
		}
	}
	
	void adicionar(Animal a) {
		listaTodosAnimais.add(a);
		System.out.println(a.nome + " adicionado na lista...");
		System.out.println(listaTodosAnimais.size());
	}
	
	void remover(Animal a) {
		listaTodosAnimais.remove(a);
		System.out.println("Removendo " + a.nome);
	}

}
