package desafio03_LacosRepeticao;

import java.util.*;

public class Desafio06 {

		public static void main(String[] args) {
			Scanner leia = new Scanner (System.in);
			
			int numero = 0;
			double somatorio = 0.00, contador = 0.00, mediaNumeros = 0.00 ;
			
			do {
				System.out.print("Digite um numero inteiro positivo: ");
				numero = leia.nextInt();
				if ((numero % 3) == 0 && numero != 0 )
				{
					somatorio = somatorio+numero;
					contador++;
				}
				
			} while (numero != 0);
			if (contador != 0){
				mediaNumeros = (somatorio / contador);
				System.out.printf("Media dos multiplos de 3 igual a %.2f", mediaNumeros);
			} else
			{
				System.out.println("Nenhum numero multiplo de 3 foi informado, não temos dados de media!");
			}
		}

	}