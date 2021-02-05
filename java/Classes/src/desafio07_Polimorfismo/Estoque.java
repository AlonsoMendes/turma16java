package desafio07_Polimorfismo;

import java.util.*;

import Collections.Aluno;

public class Estoque {
	
	public static void main(String[] args) {
		
		List<Loja> loja = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		
		int opcao, valor1;

		System.out.println("\t\t### ESTOQUE ###");
		
		do {
		System.out.print("Escolha uma opção [ 1- ARMAZENAR |2- REMOVER |3- ATUALIZAR |4- VER LISTA ]: ");
		opcao = ler.nextInt();

		if(opcao == 1)
		{	
			System.out.print("Quantos item ira armazenar: ");
			valor1 = ler.nextInt();
			for(int x = 0; x < valor1; x++) {
			
			System.out.printf("Digite o nome do produdo %d: ", (x+1));
			String valor = ler.next().toUpperCase();
			//Loja a = new Loja(valor);			
			//loja.add(a);
			loja.add(new Loja(valor));
			}
			
			}else if(opcao == 2) {
			ler.nextLine();
			System.out.print("Oque deseja remover da loja: ");
			String valor = ler.nextLine().toUpperCase();

			    for (int i=0; i < loja.size(); i++) 
			    {
			    	if(loja.get(i).getEstoque().equals(valor)) 
			    	{	
			    		loja.remove(i);
			    	}
			    }

		}else if(opcao == 3) {
			if (loja.isEmpty()) {
				System.out.println("ta vazio");
			} else {
				System.out.println("Sua lista atualmente");
				for(Loja e : loja)
				{	
					System.out.println( e.getEstoque());
				}
				
			}
		}else if(opcao == 4) {
			
			if(loja.isEmpty()) {
				System.out.println("Lista Vazia ...");
			} else {
				
				boolean aluno = loja.containsAll(loja);	
				
				System.out.println("\t\t ITEM DO ESTOQUE");
				ler.nextLine();
				System.out.println("PRODUTO");
				for(Loja e : loja)
				{	
					System.out.println( e.getEstoque());
				}
			}
			
		}else {
			System.out.println("Digite novamente uma opçao: ");
		}
		System.out.println("Deseja sair do estoque [1 - SIM | 2 - NÃO]: ");
		opcao = ler.nextInt();

	
		}while(opcao != 1);
		
		System.out.println("\t\t##### FIM DO PROGRAMA #####");
		
	}

}
