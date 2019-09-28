package exercicio_banco;

public class Utils {
	public static void limparTela() {
		System.out.println(new String(new char[70]).replace("\0", "\r\n"));
	}
}
