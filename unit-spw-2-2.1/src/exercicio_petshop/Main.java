package exercicio_petshop;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ColecaoDeAnimais colecaoDeAnimais = new ColecaoDeAnimais();
		
		System.out.println("Escolha o tipo de animal: ");
		int tipo = s.nextInt();
		
		if (tipo == 1) {
			
			Cachorro c = new Cachorro();
			
			System.out.println("Digite o nome do cachorro:");
			c.nome = s.next();
			
			System.out.println("Quantas patas?");
			c.qtdPatas = s.nextInt();
			
			colecaoDeAnimais.adicionar(c);
			
		}
		
		
		
	}

}
