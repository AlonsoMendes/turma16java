package desafios;

import java.util.*;

public class DesafioContas {
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			 double valor = 0.0, saldoFinal = 0.0;
		     char selecao, opcao, movimento,opcao2;

		        System.out.println("Selecione o tipo da conta [1/2/3/4 ou 5]: ");
		        selecao = leia.next().charAt(0);
		        
		        if (selecao == '1')
		        {
		        	System.out.print("\t\t###CONTA POUPANÇA###");
		    		System.out.println();
		            do
		            {
		                System.out.print("Selecione o movimento [D/C]: ");
		                movimento = leia.next().charAt(0);

		                if (movimento == 'D')
		                {
		                    System.out.print("Infelizmente, não podemos continuar com a operação: SALDO INSUFICIENTE");
		                }
		                else 
		                {
		                    System.out.print("Você gostaria de creditar qual valor?: ");
		                    valor = leia.nextInt();
		                    System.out.print("Deseja correção monetária? [S- Sim ou N- Não]");
		                    opcao2 = leia.next().charAt(0);

		                    if (opcao2 == 'S')
		                    {

		                        saldoFinal = valor + (valor*0.0005);
		                        System.out.printf("\nO valor do saldo atual é: %.2f",saldoFinal);

		                    }
		                    else
		                    {
		                        saldoFinal = valor;
		                        System.out.printf("\nO valor do saldo atual é: %.2f",saldoFinal);
		                    }
		                }
		                System.out.print("\nDeseja continuar? [S/N]: ");
		                opcao = leia.next().charAt(0);
		            }while(opcao == 'S' || opcao == 's');
		        }

		        if (selecao == '4')
		        {		
		        	System.out.println("\t\t###CREDITO EMPRESA###");
		    		System.out.println();
		            do
		            {
		                System.out.print("Selecione o movimento [D/C]: ");
		                movimento = leia.next().charAt(0);

		                if (movimento == 'D' || movimento == 'd')
		                {
		                    System.out.print("A CONTA NÃO PODE FICA NEGATIVA.");
		                }
		                else 
		                {
		                	System.out.println("Você gostaria de creditar qual valor?: ");
		                    valor = leia.nextInt();
		                }
		                System.out.print("DESEJA FAZER UM EMPRESTIMO [1- Sim e 2- Não]");
	                    opcao2 = leia.next().charAt(0);

	                    if (opcao2 == '1')
	                    {
	                    	System.out.print("\nDigite o valor: R$");
	                    	saldoFinal = leia.nextInt();
	                    	
	                    	if(saldoFinal > 10000){
	                    		System.out.println("LIMITE DO EMPRESTIMO É DE R$ 10.000");
	                    	}else {
	                    		saldoFinal = valor + saldoFinal;
	                    	System.out.printf("\nO valor do saldo atual é: %.2f", saldoFinal);
	                    	}
	                    }

		                System.out.print("\nDeseja continuar? [S/N]: ");
		                opcao = leia.next().charAt(0);
		                
		            }while(opcao == 'S' || opcao == 's');
		     }		
	}
}
