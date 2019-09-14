package aula1;
import java.util.concurrent.TimeUnit;

public class Aula2 {

	public static void main(String[] args) {
		
		int[] array1 = {3,4,1,2,7,8,9,10};
		
		char[] array2 = {'a','b','c','d','e','f','g','h'};
		
		String[] array3 = {"recife","joao pessoa","natal","fortaleza","aracaju","maceio","teresina","sao luiz"};
		
		boolean encontrada = false;
		
		while(encontrada=false) {
			for (int i=0;i<array1.length;i=i+1) {
				for (int j=0;j<array2.length;j=j+1){
					if(array1[i]==1&&array2[j]=='g') {
						System.out.println("senha encontrada");
						encontrada=true;
					} else {
						System.out.println(".");
					}
				}
			}	
		}

	}
}
