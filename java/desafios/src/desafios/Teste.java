package desafios;

import java.util.*;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int conta = 0;
		double valor = 0.0, saldo = 0.0;
		char sair, movimento, opcao, emprestimo;
		
		//C EMPRESA - DESEJA FAZER UM EMPRESTIMO S/N: SE SIM O LIMITE É  10.000 - SALDO'
		System.out.println("\t\t###CREDITO EMPRESA###");
		System.out.println();
		
		System.out.print("DESEJA FAZER UM EMPRESTIMO S/N:  ");
		emprestimo = ler.next().charAt(0);
			
		if(emprestimo == 'S') {
			System.out.println("DIGITE O VALOR: R$");
			valor = ler.nextDouble();
			
			if(valor <= 10.000){
				saldo += valor;
			}else  {
			System.out.print("LIMITE DO EMPRESTIMO É DE R$ 10.000");	
			} 			
		}

		do
		{	

			System.out.print("\nSELECIONE O MOVIMENTO - D/C: ");
			movimento = ler.next().charAt(0);
			
			if(movimento == 'C') {
				System.out.print("Valor: R$ ");
				valor = ler.nextDouble();
				saldo += valor;	
				}
			else if(movimento == 'D') {
				if(saldo == 0) {
					System.out.print("A CONTA NÃO PODE FICA NEGATIVA.");
				}
				else if (saldo > 0) {
					System.out.println("Valor: R$ ");
					valor = ler.nextDouble();
					saldo -= valor;
				}
			}
			
			System.out.println("\nContinuamos? S/N :");
			opcao = ler.next().charAt(0);
			
		}while (opcao =='S');
		System.out.printf("\nNOVO SALDO: R$ %.2f. ", saldo); 
		System.out.println("Fim de programa!!!");
	}

}
