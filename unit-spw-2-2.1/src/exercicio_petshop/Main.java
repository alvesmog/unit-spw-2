package exercicio_petshop;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ColecaoDeAnimais colecaoDeAnimais = new ColecaoDeAnimais();
		
		int i = 0;
		
		while (i == 0) {
			
			System.out.println("Escolha o tipo de animal: ");
			System.out.println("1-Cachorro / 2-Gato / 3-Pássaro");
			
			int tipo = s.nextInt();
			
			if (tipo == 1) {
				
				String n;
				int q;
				
				System.out.println("Digite o nome do cachorro:");
				n = s.next();
				
				System.out.println("Quantas patas?");
				q = s.nextInt();
				
				Cachorro c = new Cachorro(n,q);
				
				colecaoDeAnimais.adicionar(c);
				
				System.out.println("[0] Adicionar outro animal");
				System.out.println("[1] Sair");
				
				i = s.nextInt();
				
			}
				
			if (tipo == 2) {
				
				String n;
				int q;
				
				System.out.println("Digite o nome do :");
				n = s.next();
				
				System.out.println("Quantas patas?");
				q = s.nextInt();
				
				Gato g = new Gato(n,q);
				
				colecaoDeAnimais.adicionar(g);
				
				System.out.println("[0] Adicionar outro animal");
				System.out.println("[1] Sair");
				
				i = s.nextInt();
			
			}
			
		System.out.println("Estado final da lista: ");
		ColecaoDeAnimais.listar();
	
		}
		
	}

}
