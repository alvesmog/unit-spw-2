package exercicio_banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	
	public static ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();

	@SuppressWarnings("resource")
	
	public static void main(String[] args) throws InterruptedException {
		
		menuInicial();

	}
	
	public static void menuInicial() throws InterruptedException {
		Utils.limparTela();
		System.out.println("========================");
		System.out.println("Bem vindo ao Banco UNIT");
		System.out.println("========================");
		System.out.println("");
		System.out.println("Escolha a opção desejada");
		System.out.println("");
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Poupança");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		
		//Se 1 = Mostrar métodos publicos da conta
		//Se 2 = Mostrar métodos publicos da conta poupança
		
		if (opcao == 1) {
			
			Utils.limparTela();
			
			ContaCorrente.Opcoes();
			
		} else if (opcao == 2) {
			Utils.limparTela();
			System.out.println("========================");
			System.out.println("     Conta Poupança");
			System.out.println("========================");
			
		} else {
			Utils.limparTela();
			System.out.println("Opção inválida");
		}

	}
	
	public void criarConta(int numero, float saldo, String nomeTitular) {
		
		ContaCorrente c = new ContaCorrente(numero, saldo, nomeTitular);
		contas.add(c);
		
	}

}
