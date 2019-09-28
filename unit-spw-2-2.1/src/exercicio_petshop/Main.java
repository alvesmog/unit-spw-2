package exercicio_petshop;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ColecaoDeAnimais colecaoDeAnimais = new ColecaoDeAnimais();
		
		int i = 0;
		
		while (i == 0) {
			
			System.out.println("Escolha o tipo de animal da lista abaixo: ");
			
			if (ColecaoDeEspecies.especies.size()>0) {
				for (i=0;i<ColecaoDeEspecies.especies.size();i++) {
					System.out.println(ColecaoDeEspecies.especies.get(i).nome);
				} 
			} else {
				System.out.println("Lista de especies vazia!");
				System.out.println("Deseja adicionar uma nova espécie?");
				System.out.println("[S] / [N]");
				String opcao;
				opcao = s.next();
				if (opcao == "S" || opcao == "s") {
					
					while (opcao == "S" || opcao == "s") {
					System.out.println("Digite o nome da espécie");
					String nomeEspecie = s.next();
					Especie e = new Especie(nomeEspecie);
					ColecaoDeEspecies.adicionar(e);
					System.out.println("Deseja adicionar uma nova espécie?");
					System.out.println("[S] / [N]");
					opcao = s.next();
					}
					
				} else if (opcao == "N" || opcao == "n") {
					System.out.println("Programa encerrado");
				}
			}
			
			System.out.println(ColecaoDeEspecies.especies.get(i).nome);

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
