package desafios;

import java.util.Scanner;

public class Desafio02 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int  ano, mes, dia;
		
		System.out.println("Escreva sua idade em dias: ");
		dia = ler.nextInt();
		
		ano = dia / 365;
		mes = (dia % 365) / 30;
		dia = (dia % 365) % 30;
		
		System.out.println("Voce tem "+ano+ " ano(s), " +mes+ " meses e "+dia+ " dia(s)");
	}

}
