package exercicio_banco;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ContaCorrente {

	private int numero;
	private float saldo;
	private String nomeTitular;
	
//Construtor
	ContaCorrente(int n, float s, String nome){
		setNumero(n);
		creditar(s);
		setNomeTitular(nome);
	}
	
//Opções de conta corrente
	public static void Opcoes() throws InterruptedException{
		
		Utils.limparTela();
		System.out.println("========================");
		System.out.println("     Conta Corrente");
		System.out.println("========================");
		System.out.println("1 - Criar conta");
		System.out.println("2 - Creditar valor");
		System.out.println("3 - Debitar valor");
		System.out.print("Pressione [0] para voltar");
		
		//1 - Criar conta
		
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		
		if (opcao == 1) {
			
			Utils.limparTela();
			
			int n = Banco.contas.size() + 1;
			
			System.out.println("Digite o saldo inicial");
			float s = scanner.nextFloat();
			System.out.println("Digite o nome do titular");
			String nome = scanner.next();
			
			ContaCorrente c = new ContaCorrente(n,s,nome);
			
			Banco.contas.add(c);
			
			System.out.println("Conta criada:");
			System.out.println("- Número da conta: " + Banco.contas.get(n-1).numero);
			System.out.println("- Titular: " + Banco.contas.get(n-1).nomeTitular);
			System.out.println("- Saldo: " + Banco.contas.get(n-1).saldo);
			
			System.out.print("Pressione [0] para voltar");
			
			int voltar = scanner.nextInt();
			
//			while (voltar == 0) {
//				System.out.print(".");
//				TimeUnit.SECONDS.sleep(1);
//				System.out.print(".");
//				TimeUnit.SECONDS.sleep(1);
//				System.out.print(".");
//				TimeUnit.SECONDS.sleep(1);
//				System.out.print("\b\b\b");
//			} 
			
			if (voltar == 0) {
				Utils.limparTela();
				ContaCorrente.Opcoes();			
			}
			
		} else if (opcao == 2) {
			
			Utils.limparTela();
			if (Banco.contas.size() > 0) {
				
				System.out.println("Escolha a conta que deseja creditar: ");
				System.out.println();
				System.out.println("Conta - Titular");
				for (int i=0;i<=Banco.contas.size()-1;i++) {
					System.out.println(Banco.contas.get(i).numero + "     - " + Banco.contas.get(i).nomeTitular);
				}
				
			} else {
				System.out.println("Não há contas cadastradas!");
				System.out.print("Pressione [0] para voltar");
				int voltar = scanner.nextInt();
				if (voltar == 0) {
					Utils.limparTela();
					ContaCorrente.Opcoes();	
				} else {
					System.out.println("Opção inválida!");
				}
			}

			
		} else if (opcao == 0) {
			Utils.limparTela();
			Banco.menuInicial();
		}
		
	}
	
//Número
	int getNumero() {
		return numero;
	}
	
	void setNumero(int numero) {
		this.numero = numero;
	}
	
//Saldo
	float getSaldo() {
		return saldo;
	}
	
	public void creditar(float valor) {
		saldo = saldo + valor;		
	}
	
	public void debitar () {
		
	}
	
//Nome titular
	String getNomeTitular() {
		return nomeTitular;
	}
	
	void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	
}
