package Turma29;

import java.util.Scanner;

public class Setimo_Ex {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		int a, b, c, d, e, f, x, y;
		
		System.out.println("\nCoeficientes A: ");
		a = input.nextInt();
		System.out.println("\nCoeficientes B: ");
		b = input.nextInt();
		System.out.println("\nCoeficientes C: ");
		c = input.nextInt();
		System.out.println("\nCoeficientes D: ");
		d = input.nextInt();
		System.out.println("\nCoeficientes E: ");
		e = input.nextInt();
		System.out.println("\nCoeficientes F: ");
		f = input.nextInt();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		
		y = ((a*f) - (c*a)) / ((a*e) - (b*d));
		
		System.out.println("\nCoeficientes de X: " + x);
		System.out.println("\nCoeficientes de Y: " + y);
		
		
	}

}
