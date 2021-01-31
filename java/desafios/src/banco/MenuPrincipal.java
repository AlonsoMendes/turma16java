package banco;

import java.util.Scanner;

public class MenuPrincipal {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double saldoFinal = 0.0, valor = 0.0, debito;
		char opcao;
		
		System.out.println("MARC'S BANK");
		System.out.println("O PRIMEIRO EMPRÉSTIMO VOCÊ NÃO PAGA! VEM VOCÊ PRO MARC'S BANK!");
		
		do 
		{
			System.out.println("ESCOLHA UMA DAS OPÇÕES: ");
			System.out.println("1 - CONTA POUPANÇA\r\n"
					+ "2 - CONTA CORRENTE\r\n"
					+ "3 - CONTA EMPRESA\r\n"
					+ "4 - CONTA ESTUDANTIL\r\n"
					+ "5 - SAIR\r\n"
					+ "");
			opcao = ler.next().charAt(0);
			
			if (opcao == '5')
			{
				System.out.println("\t\t\t###OBRIGADO, VOLTE SEMPRE!!!###");	
				break;
			}
			else if (opcao == '1') 
			{
				ContaPoupanca.main(args);
			}
			else if (opcao == '2') 
			{
				
			}
			else if (opcao == '3') 
			{
				ContaEmpresa.main(args);
			}
			else if (opcao == '4') 
			{
				ContaEstudantil.main(args);
			}
			
		}while(true);	
		
	}

}

