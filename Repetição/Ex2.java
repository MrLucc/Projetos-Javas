package Repeticao;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero,impar,contpar=0,contimpar=0;
		
		for(int x=0;x<10;x++) {
			System.out.print("Entre com um valor ");
			numero = input.nextInt();
			if(numero % 2 == 0){
				contpar++;
				
			}else {
				contimpar++;
			}
			
		}
		
		System.out.print("\nTotal de numero pares é: "+contpar);
		System.out.print("\nTotal de numeros impares é: "+contimpar);
	}

}
