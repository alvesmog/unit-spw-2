package exercicio_petshop;

public class Gato extends Animal {

	Gato(String especie, String nome, int qtdPatas) {
		super(especie, nome, qtdPatas);

	}

	void comunicar() {
		System.out.println("miau miau miau....");
	}

}
