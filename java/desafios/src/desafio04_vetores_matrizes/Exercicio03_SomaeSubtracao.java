package desafio04_vetores_matrizes;

import java.util.*;

public class Exercicio03_SomaeSubtracao {
	
	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		int N1 [][] = new int [4][6];
		int N2 [][] = new int [4][6];
		int M1 [][] = new int [4][6];
		int M2 [][] = new int [4][6];
		
		System.out.println("\n\t\t\t\t\t##### MATRIZ N1 #####\n");
		for(int x = 0; x < 4; x++) 
		{
			for(int y = 0; y<6; y++)
			{
				N1[x][y] = aleatorio.nextInt(9);
				System.out.printf("\t %d \t", N1[x][y]);
			}
			System.out.println();
		}
		
		System.out.println("\n\t\t\t\t\t##### MATRIZ N2 #####\n");
		for(int x = 0; x < 4; x++) 
		{
			for(int y = 0; y<6; y++)
			{
				N2[x][y] = aleatorio.nextInt(9);
				System.out.printf("\t %d \t", N2[x][y]);
			}
			System.out.println();
		}
		
		System.out.println("\n\t\t\t##### MATRIZ M1: ADIÇÃO DA MATRIZ N1 COM N2 #####\n");
		for(int x = 0; x < 4; x++) 
		{
			for(int y = 0; y < 6; y++)
			{
				M1[x][y] = N1[x][y] + N2[x][y];
				System.out.printf("\t %d \t",M1[x][y]);
			}
		
			System.out.println();
		}
		
		System.out.println("\n\t\t\t##### MATRIZ M2: SUBTRAÇÃO DA MATRIZ N1 COM N2 #####\n");
		for(int x = 0; x < 4; x++) 
		{
			for(int y = 0; y < 6; y++)
			{
				M2[x][y] = N1[x][y] - N2[x][y];
				System.out.printf("\t %d \t",M2[x][y]);
			}
			System.out.println();
		}
			
	}

}
