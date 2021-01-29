package desafios;

import java.util.*;

public class DesafioAgenda {
		
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String agenda [][]= new String[24][31];
		String nome;
		char opcao = 0, sair;
		int dia = 0, hora = 0;
		
		
		do {
			
			System.out.print("Digite o seu nome: ");
			nome = ler.next();
			
			do {
				
				System.out.print("\nESCOLHA UM DIA PARA CADASTRO [1/31] :");
				dia = ler.nextInt();
				
				while(dia <=0 || dia > 31)
				{
					System.out.print("\nData informada incorreta, escolha uma data entre 1 e 31: ");
					dia = ler.hashCode();
				}
				
				System.out.print("SELECIONE A HORA DO EVENTO[0-23]: ");
				hora = ler.nextInt();
				
				while( hora < 0 || hora > 23 )
				{
					System.out.print("\nHora informada incorreta, escolha entre 0 e 23 h: ");
					hora = ler.nextInt();
				}
				
			ler.nextLine();
			System.out.print("\nInforme a tarefa nesta data e hora:");
			agenda[hora][dia-1] = ler.next();
			
			System.out.print("Continua 1-sim ou 2-não:");
			opcao = ler.next().charAt(0);
			
		}while(opcao == '1');
		
		
		for(int x = 0; x<24; x++ ) 
		{
			for(int y=0; y<31;y++)
			{
				if (agenda[x][y] != null)
				{
					System.out.printf("\n %s no dia %d as %d hora(s), esta agendado: %s ", nome ,y, x, agenda[x][y]);
				}
			}
		}
		
		System.out.println();
		System.out.println("\nDeseja fazer outro cadastro. 1-sim ou 2-não: ");
		sair = ler.next().charAt(0);
		
		}while(sair == '1');
		
	}
}
