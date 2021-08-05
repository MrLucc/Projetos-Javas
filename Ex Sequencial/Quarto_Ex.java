package Turma29;

import java.util.Scanner;

public class Quarto_Ex {
	
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		double d, r, s;
		
		System.out.println("\nColoque um valor positivo: ");
		a = input.nextInt();
		System.out.println("\nColoque segundo valor positivo: ");
		b = input.nextInt();
		System.out.println("\nColoque terceiro valor positivo: ");
		c = input.nextInt();
		
		r = Math.pow(a + b, 2);
		s = Math.pow(b + c, 2);
		d = (r + s) /2;
		
		System.out.println("\nResultado é: " + d);
	}

}
