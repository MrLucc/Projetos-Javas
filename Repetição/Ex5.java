/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
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
		
		System.out.println("\nSoma dos valores insiros s�o: "+somanumeros);
	}

}
