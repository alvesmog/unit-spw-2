package exercicio_petshop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Escolha o tipo de animal da lista abaixo: ");

		if (ColecaoDeEspecies.especies.size() > 0) {
			for (int i = 0; i < ColecaoDeEspecies.especies.size(); i++) {
				System.out.println(ColecaoDeEspecies.especies.get(i).nome);
			}
		} else {
			
			System.out.println("Lista de especies vazia!");
			System.out.println("Deseja adicionar uma nova espécie?");
			System.out.println("[S] / [N]");
			String opcao;
			opcao = s.next();

			if (opcao.equals("S") || opcao.equals("s")) {

				while (opcao.equals("S") || opcao.equals("s")) {
					System.out.println("Digite o nome da espécie");
					String nomeEspecie = s.next();
					Especie e = new Especie(nomeEspecie);
					ColecaoDeEspecies.adicionar(e);
					System.out.println("Deseja adicionar uma nova espécie?");
					System.out.println("[S] / [N]");
					opcao = s.next();
				}

			} else if (opcao.equals("N") || opcao.equals("n")) {
				System.out.println("Programa encerrado");
			}
		}

	}

}
