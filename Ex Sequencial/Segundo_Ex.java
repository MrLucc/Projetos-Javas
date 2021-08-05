package Turma29;

import java.util.Scanner;

public class Segundo_Ex {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int total, ano, meses, dias;
		
		System.out.println("Informe total da sua vida em idade: ");
		
		total = leia.nextInt();
		
		ano = total / 365;
		meses = (total % 365) / 30;
		dias = (total % 365) % 365;
		
		System.out.println("\nVocê tem "+ ano + " ano(s) e " + meses + " mes(es) e " + dias + " dia(s) de vida");
	}

}
