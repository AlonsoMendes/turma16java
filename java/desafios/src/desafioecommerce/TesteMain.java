package desafioecommerce;

import java.util.*;

public class TesteMain {

public static void main(String[] args)
	
	{
			System.out.println(
					"**************************************************************************************************************************************************");
					
			System.out.print("─▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄\r\n"
					+ "█░░░█░░░░░░░░░░▄▄░██░█    _     _     _   _    ___   _    _\r\n"
					+ "█░▀▀█▀▀░▄▀░▄▀░░▀▀░▄▄░█   | |   / \\   | | / \\  | o ) / \\  / \\ \r\n"
					+ "█░░░▀░░░▄▄▄▄▄░░██░▀▀░█   | |_ ( o )n_| || o | | o \\( o )| o |\r\n"
					+ "─▀▄▄▄▄▄▀─────▀▄▄▄▄▄▄▀    |___| \\_/ \\__/ |_n_| |___/ \\_/ |_n_|\r\n"
					+ "");

			//usar uma interface
			 System.out.println("   +-+   +-+ +-+ +-+   +-+ +-+ +-+ +-+ +-+\r\n"
			 		+ "   |é|   |b| |o| |a|   |m| |e| |s| |m| |o|\r\n"
			 		+ "   +-+   +-+ +-+ +-+   +-+ +-+ +-+ +-+ +-+");
			
			
			List<Produto> loja = new ArrayList<>();
			Scanner leia = new Scanner(System.in);
			char opcao;
			
			
			loja.add(new Produto("FinalFantasy","LB-001",30.00,10));
			loja.add(new Produto("CS","LB-002",10.00,10));
			loja.add(new Produto("Call of duty","LB-003",20.00,10));
			loja.add(new Produto("Pokemon","LB-004",20.00,10));
			loja.add(new Produto("Castlevania","LB-005",50.00,10));
			loja.add(new Produto("League of Legends","LB-006",10.00,10));
			loja.add(new Produto("MU- Online","LB-007",10.00,10));
			loja.add(new Produto("GTAV","LB-008",30.00,10));
			loja.add(new Produto("Mortal Kombat","LB-009",50.00,10));
			loja.add(new Produto("Free Fire","LB-010",10.00,10));
	
			
			System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
			System.out.println("  CODIGO  ESTOQUE\t  PREÇO\t\t    NOME DO PRODUTO");
			for (Produto loj : loja)
			{
				System.out.println(" ▌" +loj.getCodigo() + " ▌" +"\t" + loj.getEstoque() + " ▌" + "\t\t" + "R$" +loj.getPrecoProduto()+  " ▌"+"\t\t" + loj.getNomeProduto() );
			}
			do {
			System.out.println("1 - Realize seu cadastro\r\n" + "2 - Carrinho\r\n" + "3 - Sair \r\n");
			System.out.print("Digite o numero de sua opção: ");
			int decisao = leia.nextInt();
			
			if(decisao == 1)
			{
			Pessoa pessoa = new Pessoa("", "");
			System.out.println("Escreva seu nome: ");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.println("Escreva seu genero:  ");
			char genero = leia.next().toUpperCase().charAt(0);
				pessoa.setSexo(genero);
		        pessoa.setNomePessoa(nome);
		    System.out.println(pessoa.tratamentoGenero(genero)+ " "+ pessoa.getNomePessoa()+ " cadastro concluido..."); 
			}
			else if(decisao ==2) {
				   Carrinho();
			}else if(decisao == 3) {
				System.exit(0);
			}   
			System.out.println("Deseja ir ao menu inicial: ");
			opcao = leia.next().toUpperCase().charAt(0);
			}while(opcao == 'S');
		
	}

		public static void Cadastro()
		{	
  
		}
		
		public static void Carrinho()
		{
			Scanner leia = new Scanner(System.in);
			List<Carrinho> cliente = new ArrayList<>();
			Produto pro = new Produto();

			//Carrinho cliente1 = new Carrinho("Alonso", "M", 10, 10.00, "jogo","LB",3);
			System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
			System.out.println("  CODIGO  Quantidade do Produto\t  PREÇO\t\t    NOME DO PRODUTO");
			
			for (Carrinho loj : cliente)
			{
				System.out.println(" ▌" +loj.getCodigo() + " ▌" +"\t" + loj.getQuantidadeProdutos() + " ▌" + "\t\t" + "R$" +loj.getPrecoProduto()+  " ▌"+"\t\t" + loj.getNomeProduto() );
			}
			
			System.out.println("1 - Adicionar Carrinho\r\n" + "2 - Remover Carrinho\r\n" + "3 - Sair \r\n");
			System.out.print("Digite o numero de sua opção: ");
			int decisao = leia.nextInt();
				if(decisao == 1)
				{
					do {
						
						System.out.println("Voce quer adicionar algum produto S/N :");
						char decisao1= leia.nextLine().toUpperCase().charAt(0);
						System.out.println("Qual seria o codigo : ");
						String codigos = leia.nextLine().toUpperCase();
						
						
						for(int e = 0; e < cliente.size(); e++)
						{	
							Produto p = new Produto();
							
							if(cliente.get(e).getCodigo().equals(codigos))
							{
								cliente.get(e).setCodigo(codigos);
								
							}
						}
						for(Produto i : cliente) {
							if()
							System.out.println(i.getCodigo() + i.getNomeProduto() + quantidadeProdutos);
								
						 	}

						
						
							}while(true);
				}
			do {
	
			System.out.println("Voce quer retirar algum produto S/N :");
			char decisao1= leia.nextLine().toUpperCase().charAt(0);
			System.out.println("Qual seria o codigo : ");
			String codigos = leia.nextLine().toUpperCase();
			
			

			
			
				}while(true);
			
			
			
			
			
		}
			
}
