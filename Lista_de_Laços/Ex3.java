package Lista_de_La�os;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.print("\nDigite sua idade: ");
		idade = input.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("\nVoc� est� na categoria infantil");
			
		}else if(idade >= 15 && idade <=17) {
			System.out.println("\nVoc� est� na categoria juvenil");
			
		}else if(idade >= 18 && idade <=25) {
			System.out.println("\nVoc� est� na categoria adulto");
			
		}else {
			System.out.print("\nIdade fora do escopo");
		}
		
	}
}
