package BANK16;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		char op;
		double valor;
		
		//Conta conta1  =new Conta();	
		System.out.print("Digite o numero da conta: ");
		String numero = ler.next();
		System.out.print("Digite o cpf: ");
		String cpf = ler.next();
		System.out.print("Dia de aniversario: ");
		int dia = ler.nextInt();
		
		while (dia <= 0 || dia > 31)
		{
			System.out.println("Data invalida!! Tente de novo [1-31]");
			dia = ler.nextInt();
		}
		
		Poupanca conta1 = new Poupanca(numero, cpf, dia);
		
		//Conta conta1 = new Conta(numero, cpf);
		
		for (int x = 1; x < 3; x++)
		{
			System.out.print("\nDigite D -Debito ou C -Credito:");
			op= ler.next().toUpperCase().charAt(0);
			System.out.print("\nDigite o valor: R$ ");
			valor = ler.nextDouble();
			
			if(op == 'D')
			{
				conta1.debitar(valor);
			}else if(op == 'C')
			{
				conta1.creditar(valor);
			}else {
				System.out.print("\nOpção invalida!!!");
			}
			System.out.print("\nSaldo atual: " + conta1.getSaldo());
		}
		
		System.out.println("Digite o dia de hoje: ");
		dia = ler.nextInt();
		
		System.out.printf("Saldo atual: R$ %.2f ", conta1.getSaldo());
		 conta1.debitar(dia);
	
	
	}

}
