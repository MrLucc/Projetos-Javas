/* Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/


package Exerc�cios_Arrays;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetor = new int [6];
		int x, contpar = 0, somapar=0, contimpar=0;
		
		
		for(x=0;x<6;x++) {
			System.out.print("\nEntre com um valor: ");
			vetor[x] = input.nextInt();
			
			if(vetor[x] % 2 ==0) {
				contpar++;
				somapar += vetor[x];
				System.out.println("\nNumero digitado "+ vetor[x] + " � par");
				
			}else {
				contimpar++;
				System.out.println("\nNumero digitado "+ vetor[x] + " � impar");
			}
			
		}
		System.out.println("\nSoma dos valores pares �: " + somapar);
		System.out.println("\nNumeros impares digitados s�o: "+contimpar);
		
	}
}