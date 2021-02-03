package desafio;

import java.util.*;

import entidade.Pessoa;

public class BancaRevista {
		
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			Pessoa pessoa = new Pessoa(null);
			
			
			System.out.print("Escreva seu nome: ");
			pessoa.nome = ler.next();
			System.out.print("Digite o ano que você nasceu: ");
			pessoa.anoNascimento = ler.nextInt();
			System.out.print("Qual seu genero [M - Masculino|F - Feminino| X - Outros]: ");
			pessoa.generoPessoa = ler.next().toUpperCase().charAt(0);
			
			
			System.out.printf("%s %s %s" ,pessoa.genero(),pessoa.nome, pessoa.statusIdade());
		}
}
