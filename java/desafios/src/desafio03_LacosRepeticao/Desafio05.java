 /* Crie um programa que leia um número do teclado até que encontre
   um número igual a zero. No final, mostre a soma dos números digitados.*/

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
		
		System.out.printf("O valor total é %d", valorTotal);
	}

}
