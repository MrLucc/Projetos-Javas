/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package Repeticao;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade, idade21 = 0,idade50 = 0;
		System.out.print("\nEntre qual sua idade: ");
		idade = input.nextInt();
		
		while(idade !=-99) {
			if(idade<21) {
				idade21++;
				
			}else if(idade>50) {
				idade50++;
				
			}else {
				System.out.print("\nIdade fora do escopo para analise!");
			}
			
			System.out.print("\nEntre qual sua idade: ");
			idade = input.nextInt();
		}
		
		System.out.print("\nTotal de pessoas abaixo de 21 é: "+ idade21);
		System.out.print("Total de pessoas acima de 50 é: "+idade50);
	}
	

}
