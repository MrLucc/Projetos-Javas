/*Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: */

package Exercícios_Arrays;

public class Ex1 {
	public static void main(String[] args) {
		
		int [] vetor = new int [6];
		int soma = 0, x;
		
		for(x=0;x<6;x++) {
			vetor[0]= 1;
			vetor[1]= 0;
			vetor[2]= 5;
			vetor[3]= -2;
			vetor[4]= -5;
			vetor[5]= 7;
		}
			soma = vetor[0] + vetor[1] + vetor[5];
			System.out.print("\nSoma entre as pocições 0, 1 e 5 são: " + soma);
		
			vetor[4] = 100;
			
			for(x=0;x<6;x++) {
			System.out.print("\nOs valores da matriz são: "+vetor[x]);
			}
	}

}
