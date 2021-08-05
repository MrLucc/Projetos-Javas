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
		
		System.out.printf("\nMédia dos números mútiplos de 3 é: %2.2f ",medianumero);
	}

}
