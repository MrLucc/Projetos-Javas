package Exercícios_Arrays;

import java.util.Scanner;

public class Exc4 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int  linha, coluna=0, escolha;
		int adicao;
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("Entre com qualquer valor na Matriz1: ");
				matriz1[linha][coluna] = input.nextFloat();
				System.out.println("Entre com qualquer valor na Matriz2: ");
				matriz2[linha][coluna] = input.nextFloat();
			}
		}
		
		System.out.println("\nPara somar as duas matrizes \n(Digite 1): ");
		System.out.println("\nSubtrair primeira matriz da segunda \n(Digite 2): ");
		System.out.println("\nPara adicionar uma costante as duas matrizes \n(Digite 3): ");
		System.out.println("\nImprimir as matrizes \n(Digite 4): ");
		escolha = input.nextInt();
		System.out.println("\nEntre com valor que deseja da constante: ");
		adicao = input.nextInt();
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				
				switch(escolha) {
		
				case(1):
					matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
					System.out.printf("[%.0f] ",matriz3[linha][coluna]);
					break;
		
				case(2):
					matriz3[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna];
					System.out.printf("[%.0f] ",matriz3[linha][coluna]);
					break;
					
				case(3):
					matriz1[linha][coluna] += adicao;
					matriz2[linha][coluna] += adicao;
					System.out.printf(" | [%.0f] | ",matriz1[linha][coluna]);
					System.out.printf(" | [%.0f] | ",matriz2[linha][coluna]);
					break;
					
				case(4):
					System.out.printf(" | [%.0f] | ", matriz1[linha][coluna]);
					System.out.printf(" | [%.0f] | ", matriz2[linha][coluna]);
					break;
				}
			}
			System.out.println(); //PARECIDO COM UM QUEBRA LINHA.
		}
	}
}
