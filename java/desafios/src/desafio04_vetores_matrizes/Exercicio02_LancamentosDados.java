package desafio04_vetores_matrizes;

import java.util.*;

public class Exercicio02_LancamentosDados {
	
	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		final int TAMANHO = 10;
		int lancamentos[] = new int[TAMANHO];
		double media = 0.0, somatorio = 0.0;
		int maiorValor = 0, contador = 0;
			
		
		System.out.println("\t\t#####JOGUE OS DADOS#####");

		
		for(int x = 0; x < TAMANHO; x++) {
			
			 lancamentos[x] = gerador.nextInt(6)+1;

			 somatorio += lancamentos[x];
			
			if(lancamentos[x] >= maiorValor ) 
			{
				if(lancamentos[x] == maiorValor)
				{
					contador++;
				}
				else
				{
					contador = 1;
				}
				maiorValor = lancamentos[x];
			}
			
		}
		
		for (int x = 0; x< TAMANHO; x++)
		{
			System.out.printf("\nLancamento %dº é igual a %d.",(x+1),lancamentos[x]);
		}
		media = somatorio/TAMANHO;
		
		System.out.println();
		System.out.printf("\nA soma dos valores é %.2f", somatorio);
		System.out.printf("\nA média aritmética é %.2f", media);
		System.out.printf("\nMaior valor informado foi %d que aparece %d nos lançamentos", maiorValor, contador);
	}

}
