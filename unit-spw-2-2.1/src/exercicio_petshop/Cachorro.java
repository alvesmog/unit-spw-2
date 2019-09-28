package exercicio_petshop;

public class Cachorro extends Animal {
	
	
	void comunicar(){
		System.out.println("au au au");
	}
	
	public void brigarComLadrao(){
		comunicar();
		mover();
	}

	
}
