package desafio06_herança_encapsulamento;

import java.util.*;

public class TesteFornecedor {

	public static void main(String[] args) 		
	{
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		Fornecedor fornecedor = new Fornecedor("Alonso", "Rua XXX", "4002-8922", 10.000, 1.900);
		
		System.out.printf("R$ %.3f",fornecedor.obterSaldo());
		
	
		
		/*
		System.out.print("Digite seu nome ");
		String nome = ler.next();
		System.out.print("Digite seu endereço: ");
		String endereco = ler.next();
		System.out.print("Digite seu telefone: ");
		String telefone = ler.next();*/
		
		
		
	}

}
