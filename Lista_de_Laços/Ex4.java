package Lista_de_La�os;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num1;
		
		System.out.println("\nDigite um valor para saber ser par ou impar: ");
		num1 = input.nextDouble();
		
		if(num1 % 2 == 0) {
			System.out.printf("\nNumero escolhido � par, raiz quadrada dele �:  %.2f" ,Math.sqrt(num1));
			
		}else {
			System.out.println("\nNumero escolhido � impar " + Math.pow(num1,2));
		}
	}

}
