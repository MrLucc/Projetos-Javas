package Turma29;

import java.util.Scanner;

public class Primeiro_Ex {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, dia;
		
		System.out.println("Qual sua idade?: ");
		idade = leia.nextInt();
		
		dia = idade * 365;
		
		System.out.println("\nSua idade em dias é: " + dia);
		
		
	}

}
