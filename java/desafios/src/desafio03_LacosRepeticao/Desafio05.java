 /* Crie um programa que leia um n�mero do teclado at� que encontre
   um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.*/

package desafio03_LacosRepeticao;

import java.util.*;

public class Desafio05 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, valorTotal = 0;
		
		do {
			System.out.print("Digite um numero: ");
			numero = ler.nextInt();
			valorTotal += numero;
			
		}while(numero != 0);
		
		System.out.printf("O valor total � %d", valorTotal);
	}

}
