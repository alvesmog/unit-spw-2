package exercicio_petshop;

public class Cachorro extends Animal {
	
	public Cachorro(String n, int q) {
		
		especie = "Cachorro";
		nome = n;
		qtdPatas = q;
		
	}
	
	void comunicar(){
		System.out.println("au au au");
	}
	
	public void brigarComLadrao(){
		comunicar();
		mover();
	}

	
}
