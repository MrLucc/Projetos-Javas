package Lista_de_Laços;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args ) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("\nDigite primeiro valor: ");
		num1 = input.nextInt();
		System.out.println("\nDigite segundo valor: ");
		num2 = input.nextInt();
		System.out.println("\nDigite terceiro valor: ");
		num3 = input.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("\nMaior valor é " + num1);
			
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("\nMaior valor é "+ num2);
			
		} else {
			System.out.println("\nMaior valor é " + num3);
		}
	}

}
