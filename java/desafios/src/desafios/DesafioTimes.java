package desafios;

import java.util.*;

public class DesafioTimes {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String times [] = {"SPFC", "SANTOS", "PALMEIRAS", "CORITHIANS"};
		int pontos[] = new int [4];
		char resposta;
		int matriz[][] = new int[4][4];
		
		for(int x = 0; x<2; x++)
		{
			System.out.printf("Rodada %d \n", (x+1));
			for(int y = 0; y<4; y++)
			{
				System.out.printf("%s : G-ganhou P-perdeu ou E-empatou [G/P/E]: ", times[y]);
				resposta = ler.next().charAt(0);
				
				if(resposta == 'G') {
					pontos[y] += 3;
				}
				else if (resposta == 'E')
				{
					pontos[y] += 1;
				}
				else if(resposta == 'P')
				{
					pontos[y] += 0;
				}
			}
		}
		System.out.println();
		System.out.println("\t\t#####CLASSIFICAÇÃO#####\n");
		for(int z = 0; z < 4; z++)
		{
			System.out.printf("%s finalizou com %d pontos.\n", times[z], pontos[z]);
		}
	}
}