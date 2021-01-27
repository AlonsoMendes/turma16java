package desafios;

import java.util.Scanner;

public class Desafio05
{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float nota1, nota2, nota3, mediaFinal;
		
		System.out.println("Escreva sua primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("Escreva sua segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.println("Escreva sua terceira nota: ");
		nota3 = ler.nextFloat();
		
		mediaFinal = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
		
		System.out.println("Sua media final foi de: " + mediaFinal);
	}

}
