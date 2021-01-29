package desafio04_vetores_matrizes;

import java.util.*;

public class Exercicio04_SomaTotal_Diagonal {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int matriz[][] = new int [3][3];
		int soma = 0, diagonal = 0;
		
		for(int x= 0; x< 3; x++)
		{
			for(int y=0; y < 3; y++)
			{
				System.out.print("Escreva o valor: ");
				matriz[x][y] = ler.nextInt();
				
				soma += matriz[x][y];
				
				if(x == y)
				{
					diagonal += matriz[x][y];
				}
			}
		}
		
		System.out.printf("A soma dos valores da primeira diagonal é %d soma total da matriz é %d", diagonal, soma);
	}
}
