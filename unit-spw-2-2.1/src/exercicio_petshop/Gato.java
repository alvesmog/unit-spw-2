package exercicio_petshop;

public class Gato extends Animal {
	
	Gato(String nome, int qtdPatas){
		
		especie = "Gato";
		this.nome = nome;
		qtdPatas = qtdPatas;
		
	}
	
	void comunicar() {
		System.out.println("miau miau miau....");
	}

}
