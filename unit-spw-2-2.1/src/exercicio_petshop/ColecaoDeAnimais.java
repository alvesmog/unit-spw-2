package exercicio_petshop;

import java.util.ArrayList;

public class ColecaoDeAnimais {
	
	static ArrayList<Animal> listaTodosAnimais = new ArrayList<Animal>();
	
	static void listar() {
		for(int i=0;i<=ColecaoDeAnimais.listaTodosAnimais.size()-1;i++) {
			if (ColecaoDeAnimais.listaTodosAnimais.get(i).qtdPatas > 2) {
				System.out.println(ColecaoDeAnimais.listaTodosAnimais.get(i).nome);
			}
		}
	}
	
	void adicionar(Animal a) {
		listaTodosAnimais.add(a);
		System.out.println(a.nome + " adicionado na lista...");
		System.out.println("Tamanho da lista: " + listaTodosAnimais.size());
	}
	
	void remover(int indice) {
		listaTodosAnimais.remove(indice);
		System.out.println("Removendo " + listaTodosAnimais.get(indice).nome);
	}

}
