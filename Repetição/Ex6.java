package Repeticao;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero, somanumero = 0, contnumero = 0;
		float medianumero = 0;
		
		do {
			System.out.println("\nEntre com qualuqer valor: ");
			numero = input.nextInt();
			
			if(numero % 3 ==0) {
				contnumero++;
				somanumero += numero;
			}
			
			
		}while(numero !=0);
		
		medianumero = somanumero/contnumero;
		
		System.out.printf("\nM�dia dos n�meros m�tiplos de 3 �: %2.2f ",medianumero);
	}

}
