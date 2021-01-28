package Treino;

import java.util.*;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, n4;
		
		System.out.print("Escreva o numero do primeiro quadrado: ");
		n1 = ler.nextDouble();
		System.out.print("Escreva o numero do segundo quadrado: ");
		n2 = ler.nextDouble();
		System.out.print("Escreva o numero do terceiro quadrado: ");
		n3 = ler.nextDouble();
		System.out.print("Escreva o numero do quarto quadrado: ");
		n4 = ler.nextDouble();
		
		if((Math.pow(n3, 2) >= 1000))
		{
			n3 = (Math.pow(n3, 2));
			System.out.print(n3);
		}
		else {
			System.out.printf("O primeiro quadrado é igual a %.2f.", (Math.pow(n1, 2)));
			System.out.printf("\nO segundo quadrado é igual a %.2f.", (Math.pow(n2, 2)));
			System.out.printf("\nO terceiro quadrado é igual a %.2f.", (Math.pow(n3, 2)));
			System.out.printf("\nO quarto quadrado é igual a %.2f.", (Math.pow(n4, 2)));
		}			
	}
}
