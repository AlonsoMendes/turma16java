package desafios;

import java.util.*;

public class DesafioContas {
		
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
					contaPoupanca();
				}
				else if (opcao == '2') 
				{
					
				}
				else if (opcao == '3') 
				{
					contaEmpresa();
				}
				else if (opcao == '4') 
				{
					contaEstudantil();
				}
				
			}while(true);
			
			
		}

			public static void contaPoupanca()
			{
				Scanner leia = new Scanner(System.in);
				double saldoFinal = 0.0, valor = 0.0, debito;
				char selecao, opcao, movimento,opcao2;
				
				System.out.println("\t\t###CONTA POUPANÇA###");
	            System.out.println();
	            
	            do 
	            {
	            do
				{	
					System.out.print("Selecione o movimento [D - debito | C - crédito ]: ");
					movimento = leia.next().toUpperCase().charAt(0);
				
					if (movimento == 'D')
					{
						System.out.print("Digite o valor para débito: ");
						debito = leia.nextDouble();
						if (saldoFinal>0)
						{
							while (saldoFinal < debito)
							{
								System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinal);
								System.out.print("Digite o valor para débito: ");
								debito = leia.nextDouble();
							}
							saldoFinal = valor - debito;
							System.out.printf("Saldo atual é R$ %.2f \n", saldoFinal);
						}
						else if (saldoFinal == 0)
						{
							System.out.print("SALDO INSUFICIENTE: faça um crédito primeiramente\n");
						}
					}else 
						{
						System.out.print("Você gostaria de creditar qual valor?: ");
						valor = leia.nextInt();

						saldoFinal = saldoFinal + valor;
						System.out.printf("\nO valor do saldo atual é: %.2f",saldoFinal);
					}
					System.out.print("\nDeseja continuar? [S- sim | N- não ]: ");
					opcao = leia.next().toUpperCase().charAt(0);
				}while(opcao == 'S');
			
	            System.out.print("Deseja correção monetária? [S- sim | N- não ]:");
				opcao2 = leia.next().toUpperCase().charAt(0);
	    		
				if (opcao2 == 'S') 
	    		{
	    			saldoFinal += (valor * 0.0005);
	    		}
	    		System.out.printf("SALDO FINAL DA CONTA POUPANÇA %.2f \n", saldoFinal);
	    		System.out.println();
	    		System.out.print("\nDESEJA IR PARA O MENU INICIAL ? [S- sim | N- não ]: ");
	                opcao = leia.next().toUpperCase().charAt(0);

	            }while(opcao != 'S');
	    		
	           }

			public static void contaEmpresa()
	        {
				Scanner leia = new Scanner(System.in);
				double saldoFinal = 0.0, creditar = 0.0, debito = 0.0, emprestimo = 0.0, emprestimoTotal = 10000, saldoNegativo = 0.0;
				char selecao, opcao, movimento,opcao2;
				
				System.out.println("\t\t###CONTA EMPRESA###");
	            System.out.println();
	            
	            do
	            {
	                System.out.print("\nSelecione o movimento [D - debito | C - crédito ]: ");
	                movimento = leia.next().toUpperCase().charAt(0);

	                if (movimento == 'D')
	                {    	
	                	System.out.print("Digite o valor para débito: ");
						debito = leia.nextDouble();
						
						if(debito > saldoFinal)
						{
							System.out.print("Saldo insuficiente. tente de novo!\n");
						}
	                	
						if (saldoFinal > 0)
	                	{
	                		while (saldoFinal < debito)
	                		{
	                			System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinal);
								System.out.print("Digite o valor para débito novamente: R$ ");
								debito = leia.nextDouble();
							}	
	                		
	                		saldoFinal -= debito;
							System.out.printf("Saldo atual é R$ %.2f \n", saldoFinal);
	                 	}
						else if (saldoFinal < 0)	
	                 	{
	                 		System.out.print("\nA CONTA NÃO PODE FICAR NEGATIVA.");
	                 	}
	                }  
	                else 
	                {
	                    System.out.println("\nVocê gostaria de creditar qual valor?: ");
	                    creditar = leia.nextInt();
	                    
	                   saldoFinal += creditar;
	                   
	                   System.out.printf("Seu saldo atual é R$ %.2f \n", saldoFinal);
	                }
	                
	                
	                System.out.printf("LIMITE DO EMPRESTIMO É DE *** %.2f ***", emprestimoTotal);
	                System.out.print("\nDESEJA FAZER UM EMPRESTIMO [S- Sim e N- Não]");
	                opcao2 = leia.next().toUpperCase().charAt(0);
	                  
		               while(opcao2 == 'S')
		                {    
		                do { 

		                    System.out.print("\nDigite o valor do emprestimo: R$");
		                    emprestimo = leia.nextInt();

		                    emprestimoTotal -= emprestimo;

		                    if(emprestimoTotal < 0)
		                    {
		                    	saldoNegativo = emprestimoTotal;

		                    	System.out.printf("SALDO INDISPONIVEL");
		                    	emprestimoTotal = (saldoNegativo + emprestimo);
		                    }
		                    else if(emprestimo > 10000){
		                        System.out.print("LIMITE DO EMPRESTIMO É DE R$ 10.000");
		                        
		                    }else {
		                        saldoFinal += emprestimo;
		                    System.out.printf("\nO valor do saldo atual é: %.2f", saldoFinal);
		                    }
		                    
		                    System.out.printf("\nVoce possui um limite de emprestimo atual de R$ %.2f", emprestimoTotal);
		                
		                System.out.print("\n DESEJA CONTINUAR COM O EMPRESTIMO [S- sim | N- não ]: ");
		                opcao = leia.next().toUpperCase().charAt(0);
		                
		               }while(opcao == 'S'); 
		                
		                opcao2 = 'N';
		            }
			                System.out.print("\nDESEJA IR PARA O MENU INICIAL ? [S- sim | N- não ]: ");
			                opcao = leia.next().toUpperCase().charAt(0);

			            }while(opcao != 'S');
	            }

			
	            public static void contaEstudantil()
		        {
					Scanner leia = new Scanner(System.in);
					double saldoFinal = 0.0, creditar = 0.0, debito = 0.0, emprestimo = 0.0, emprestimoTotal = 5000, saldoNegativo = 0.0;
					char selecao, opcao, movimento,opcao2;
					
					System.out.println("\t\t###CONTA ESTUDANTIL###");
		            System.out.println();
		            
		            do
		            {
		                System.out.print("\nSelecione o movimento [D - debito | C - crédito ]: ");
		                movimento = leia.next().toUpperCase().charAt(0);

		                if (movimento == 'D')
		                {    	
		                	System.out.print("Digite o valor para débito: ");
							debito = leia.nextDouble();
							
							if(debito > saldoFinal)
							{
								System.out.print("Saldo insuficiente. tente de novo!\n");
							}
		                	
							if (saldoFinal > 0)
		                	{
		                		while (saldoFinal < debito)
		                		{
		                			System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinal);
									System.out.print("Digite o valor para débito novamente: R$ ");
									debito = leia.nextDouble();
								}	
		                		
		                		saldoFinal -= debito;
								System.out.printf("Saldo atual é R$ %.2f \n", saldoFinal);
		                 	}
							else if (saldoFinal < 0)	
		                 	{
		                 		System.out.print("\nA CONTA NÃO PODE FICAR NEGATIVA.");
		                 	}
		                }  
		                else 
		                {
		                    System.out.println("\nVocê gostaria de creditar qual valor?: ");
		                    creditar = leia.nextInt();
		                    
		                   saldoFinal += creditar;
		                   
		                   System.out.printf("Seu saldo atual é R$ %.2f \n", saldoFinal);
		                }
		                
		                System.out.printf("LIMITE DO EMPRESTIMO ESTUDANTIL É DE *** %.2f ***", emprestimoTotal);
		                System.out.print("\nDESEJA FAZER UM EMPRESTIMO [S- Sim e N- Não]");
		                opcao2 = leia.next().toUpperCase().charAt(0);
		                
		               while(opcao2 == 'S')
		                {    
		                do { 

		                    System.out.print("\nDigite o valor do emprestimo: R$");
		                    emprestimo = leia.nextInt();

		                    emprestimoTotal -= emprestimo;

		                    if(emprestimoTotal < 0)
		                    {
		                    	saldoNegativo = emprestimoTotal;

		                    	System.out.printf("SALDO INDISPONIVEL");
		                    	emprestimoTotal = (saldoNegativo + emprestimo);
		                    }
		                    else if(emprestimo > 5000){
		                        System.out.print("LIMITE DO EMPRESTIMO É DE R$ 5.000");
		                        
		                    }else {
		                        saldoFinal += emprestimo;
		                    System.out.printf("\nO valor do saldo atual é: %.2f", saldoFinal);
		                    }
		                    
		                    System.out.printf("\nVoce possui um limite de emprestimo atual de R$ %.2f", emprestimoTotal);
		                
		                System.out.print("\n DESEJA CONTINUAR COM O EMPRESTIMO [S- sim | N- não ]: ");
		                opcao = leia.next().toUpperCase().charAt(0);
		                
		               }while(opcao == 'S'); 
		                
		                opcao2 = 'N';
		            }

		                System.out.print("\nDESEJA IR PARA O MENU INICIAL ? [S- sim | N- não ]: ");
		                opcao = leia.next().toUpperCase().charAt(0);

		            }while(opcao != 'S');
					
	}

}
