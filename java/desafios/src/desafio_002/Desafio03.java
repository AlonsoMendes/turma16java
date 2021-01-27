package desafio_002;

import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Escreva sua idade: ");
		idade = ler.nextInt();
		
		if(idade < 10)
		{
			System.out.print("Não temos essa categoria");
		}
		else if(idade <= 14)
		{
			System.out.print("Categoria Infantil");
		}
		else if(idade <= 17)
		{
			System.out.print("Categoria Juvenil");
		}
		else {
			System.out.println("Categoria Adulto");
		}
	}

}
