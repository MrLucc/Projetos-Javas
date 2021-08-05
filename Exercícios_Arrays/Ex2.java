/* Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/


package Exercícios_Arrays;

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
				System.out.println("\nNumero digitado "+ vetor[x] + " é par");
				
			}else {
				contimpar++;
				System.out.println("\nNumero digitado "+ vetor[x] + " é impar");
			}
			
		}
		System.out.println("\nSoma dos valores pares é: " + somapar);
		System.out.println("\nNumeros impares digitados são: "+contimpar);
		
	}
}