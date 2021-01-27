package desafio_002;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um numero: ");
		numero = ler.nextInt();
		
		if(numero <=0 ) {
			System.out.print("Numero invalido, menor ou igual a 0");
		}
		else if(numero % 2 == 1)
		{
			System.out.print("O numero é impar ");
		}
		else
		{
			System.out.print("O numero é par ");
		}
	}
}
