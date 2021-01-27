package desafios;

import java.util.Scanner;

public class Desafio06 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float x1, x2, y1, y2, raiz, valor;
		
		System.out.println("Escreva o valor de x1: ");
		x1 = ler.nextInt();
		System.out.println("Escreva o valor de x2: ");
		x2 = ler.nextInt();
		System.out.println("Escreva o valor de y1: ");
		y1 = ler.nextInt();
		System.out.println("Escreva o valor de y2: ");
		y2 = ler.nextInt();
		
		valor = (float) (Math.pow((x2-x1), 2) +  Math.pow((y2-y1), 2));
		raiz = (float) Math.sqrt(valor);
		
		System.out.println("O resultado é " + raiz);

	}
}
