package Turma29;

import java.util.Scanner;

public class Sexto_Ex {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		double x1, x2, y1, y2, d;
		
		System.out.println("\nEntre com valor de X1: ");
		x1 = input.nextDouble();
		System.out.println("\nEntre com o valor de X2: ");
		x2 = input.nextDouble();
		System.out.println("\nEntre com o valor de Y1: ");
		y1 = input.nextDouble();
		System.out.println("\nEntre com o valor de Y2: ");
		y2 = input.nextDouble();
		
		d = Math.sqrt(Math.pow(x1 - x2,2)+Math.pow(y1 - y2,2));
		
		System.out.printf("A distância entre dois pontos é %.2f", d);
	}

}
