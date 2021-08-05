/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

package Exercícios_Arrays;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int contmatriz =0;
		
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.println("Entre com qualquer valor: ");
				matriz[linha][coluna] = input.nextInt();
				
				if(matriz[linha][coluna]>=10) {
					contmatriz++;
					
				}
			}
		}
		
		System.out.println("Valores maiores que 10 digitados são: " + contmatriz);
		
	}

}
