package desafio05_classes;

import java.util.*;

public class Desafio01_Cliente {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Desafio01_ClienteClass cliente = new Desafio01_ClienteClass();
		
		/*
		System.out.print("Escreva o seu nome: ");
		cliente.nome = ler.next();

		System.out.print("Escreva o seu pedido: ");
		cliente.pedido = ler.next();

		System.out.print("Qual forma de pagamento: ");
		cliente.formaPagamento = ler.next();*/
		
		System.out.printf("\n %s",cliente.Idade());
		System.out.printf("\n %s o seu pedido foi  %s  e sua forma de pagamenteo será %s ", cliente.nome, cliente.pedido  ,cliente.formaPagamento);
		
		
	}
}

