package Turma29;

import java.util.Scanner;

public class Oitavo_Ex {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double custof, custoc;
		
		System.out.println("\nEntre com o custo de f�bricante do carro R$: ");
		custof = input.nextDouble();
		
		custoc = custof + (custof * 0.73);
		
		System.out.printf("\nO consumidor ir� pagar R$:%.2f",custoc);
	}

}
