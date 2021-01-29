package desafio04_vetores_matrizes;

import java.util.*;

public class Exercicio01_MaiorPontuacao {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int pontuacao [] = new int[5];
		int maiorPontuacao = 0;
		
		for(int x = 0; x < 5; x++)
		{
			System.out.print("Escreva a nota da atividade: ");
			pontuacao[x] = ler.nextInt();
			
			if(pontuacao[x] > maiorPontuacao)
			{
				maiorPontuacao = pontuacao[x];
			}
		}
		System.out.printf("A maior pnontuação foi %d.", maiorPontuacao);
	}
}
