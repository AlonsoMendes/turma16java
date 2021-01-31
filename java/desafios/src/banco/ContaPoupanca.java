package banco;

import java.util.Scanner;

public class ContaPoupanca {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		double saldoFinal = 0.0, valor = 0.0, debito;
		char selecao, opcao, movimento,opcao2;
		
		System.out.println("\t\t###CONTA POUPANÇA###");
        System.out.println();
        
        do{
        	do{
        		
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

}
