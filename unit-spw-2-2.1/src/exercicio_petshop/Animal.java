package exercicio_petshop;

public class Animal extends Especie {

	String raca;
	String nome;
	int idade;
	int qtdPatas;
	float peso;
	
	Animal(String especie, String nome, int qtdPatas){
		super(especie);
		this.nome = nome;
		this.qtdPatas = qtdPatas;
	}
	
	
	void comunicar(){
		System.out.println("se comunica");	
	}
	
	void mover() {
		System.out.println("se movimenta");
		
	}
	
	void dormir() {
		System.out.println("dorme");
		
	}
	
	void comer() {
		System.out.println("come");
		
	}

}
