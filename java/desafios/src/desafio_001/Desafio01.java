package desafio_001;

import java.util.Scanner;

public class Desafio01 {
	 public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
		 
		 int idade, dia, mes, ano;
		 
		 System.out.print("Escreva a sua idade em anos: ");
		 ano = ler.nextInt();
		 System.out.print("Quantos meses de vida: ");
		 mes = ler.nextInt();
		 System.out.print("Quantos dias de vida: ");
		 dia = ler.nextInt();
		 
		 idade = (ano *365) + (mes*30) + dia;
		 
		 System.out.printf("Sua idade em dias é %d", idade);
		 
		 ler.close();
	}

}

