package Turma29;

import java.util.Scanner;

public class Quinto_Ex {
	
	public static void main(String[] args ) {
	
	Scanner input = new Scanner(System.in);
	
	float nota1, nota2, nota3, media;
	
	System.out.println("\nInsira a primeira nota: ");
	nota1 = input.nextFloat();
	System.out.println("\nInsira a segunda nota: ");
	nota2 = input.nextFloat();
	System.out.println("\nInsira a terceira nota: ");
	nota3 = input.nextFloat();
	
	media = ((nota1 * 2) + (nota2 * 3) + (nota3 *5)) / 10;
	
	System.out.printf("\nMedia do aluno é: %2.2f ", media);
	

	}
}
