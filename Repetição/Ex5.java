/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package Repeticao;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numeros, somanumeros = 0;
		
		System.out.println("Entre com qualquer valor: ");
		numeros = input.nextInt();
		
		do {
			somanumeros += numeros;
			System.out.println("Entre com qualquer valor: ");
			numeros = input.nextInt();
		}
		while(numeros!=0);
		
		System.out.println("\nSoma dos valores insiros são: "+somanumeros);
	}

}
