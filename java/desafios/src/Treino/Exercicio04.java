package Treino;

import java.util.*;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Escreva um numero: ");
		numero = ler.nextInt();
		
		if (numero > 0) {
			if (numero % 2 == 0) {
				System.out.printf("O número %d é positivo e par.", numero);
			}else {
				System.out.printf("O número %d é positivo e impar.", numero);
			}
		}
		else if (numero < 0) {
			if (numero % 2 == 0) {
				System.out.printf("O número %d é negativo e par.", numero);
			}else {
				System.out.printf("O número %d é negativo e ímpar.", numero);
			}
		}
		else {
			System.out.printf("Voce digitou o valor 0 que é um numero neutro.");
		}
		
	}

}
