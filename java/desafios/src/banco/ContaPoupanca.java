package banco;

import java.util.Scanner;

public class ContaPoupanca {
	
	public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		double saldoFinal = 0.0, valor = 0.0, debito;
		char selecao, opcao, movimento,opcao2;
		
		System.out.println("\t\t###CONTA POUPAN�A###");
        System.out.println();
        
        do{
        	do{
        		
			System.out.print("Selecione o movimento [D - debito | C - cr�dito ]: ");
			movimento = leia.next().toUpperCase().charAt(0);
		
			if (movimento == 'D')
			{
				System.out.print("Digite o valor para d�bito: ");
				debito = leia.nextDouble();
				if (saldoFinal>0)
				{
					while (saldoFinal < debito)
					{
						System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!\n",saldoFinal);
						System.out.print("Digite o valor para d�bito: ");
						debito = leia.nextDouble();
					}
					saldoFinal = valor - debito;
					System.out.printf("Saldo atual � R$ %.2f \n", saldoFinal);
				}
				else if (saldoFinal == 0)
				{
					System.out.print("SALDO INSUFICIENTE: fa�a um cr�dito primeiramente\n");
				}
			}else 
				{
				System.out.print("Voc� gostaria de creditar qual valor?: ");
				valor = leia.nextInt();

				saldoFinal = saldoFinal + valor;
				System.out.printf("\nO valor do saldo atual �: %.2f",saldoFinal);
			}
			System.out.print("\nDeseja continuar? [S- sim | N- n�o ]: ");
			opcao = leia.next().toUpperCase().charAt(0);
		}while(opcao == 'S');
	
        System.out.print("Deseja corre��o monet�ria? [S- sim | N- n�o ]:");
		opcao2 = leia.next().toUpperCase().charAt(0);
		
		if (opcao2 == 'S') 
		{
			saldoFinal += (valor * 0.0005);
		}
		System.out.printf("SALDO FINAL DA CONTA POUPAN�A %.2f \n", saldoFinal);
		System.out.println();
		System.out.print("\nDESEJA IR PARA O MENU INICIAL ? [S- sim | N- n�o ]: ");
            opcao = leia.next().toUpperCase().charAt(0);

        }while(opcao != 'S');
		
       }

}
