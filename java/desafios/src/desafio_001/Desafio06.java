package desafio_001;

import java.util.Scanner;

public class Desafio06 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float x1, x2, y1, y2, raiz, valor;
		
		System.out.print("Escreva o valor de x1: ");
		x1 = ler.nextFloat();
		System.out.print("Escreva o valor de x2: ");
		x2 = ler.nextFloat();
		System.out.print("Escreva o valor de y1: ");
		y1 = ler.nextFloat();
		System.out.print("Escreva o valor de y2: ");
		y2 = ler.nextFloat();
		
		valor = (float) (Math.pow((x2-x1), 2) +  Math.pow((y2-y1), 2));
		raiz = (float) Math.sqrt(valor);
		
		System.out.printf("O resultado é %.2f", raiz);

	}
}
