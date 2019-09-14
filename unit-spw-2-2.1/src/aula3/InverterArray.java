package aula3;

public class InverterArray {

	public static void main(String[] args) {
		int[] arrayInteiros = {0,1,2,3,4,5,6,7,8,9};
		
		int[] arrayInvertido = new int[10];
	
		System.out.println("Array inteiros:");
		
		for (int i=0; i<=arrayInteiros.length-1;i=i+1) {
			if (i<arrayInteiros.length-1) {
				System.out.print(arrayInteiros[i]+", ");			
			} else {
				System.out.println(arrayInteiros[i]+".");
			}
		}
		
		System.out.println("Array invertido:");
		
		int i2=0;
		for (int i=arrayInteiros.length-1;i>=0;i--) {
			if (i2<arrayInteiros.length-1) {
				arrayInvertido[i2] = arrayInteiros[i];
				System.out.print(arrayInvertido[i2]+", ");
				i2=i2+1;
			} else {
				arrayInvertido[i2] = arrayInteiros[i];
				System.out.print(arrayInvertido[i2]+".");
				i2=i2+1;
			}
		}
	}
}
