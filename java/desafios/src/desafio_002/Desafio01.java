package desafio_002;

import java.util.Scanner;

public class Desafio01 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, maior = 0;	
		
		for(int x = 0; x < 3; x++) {
			System.out.print("Digite um numero: ");
			numero = ler.nextInt();
			
			if(numero > maior) {
				maior = numero;
			}
			
		}System.out.print("O maior numero é " + maior);	
	}

}
