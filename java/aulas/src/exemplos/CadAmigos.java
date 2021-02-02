package exemplos;

import java.util.*;

import entidade.Pessoa;

public class CadAmigos {

	public static void main(String[] args) {

		Scanner leia =  new Scanner(System.in);
		
		Pessoa broder1 = new Pessoa();
		
		System.out.println("Digite o nome: ");
		broder1.nome = leia.next();
		System.out.println("Qual seu genero [M - Masculino|F - Feminino| X - Outros]: ");
		broder1.generoPessoa = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento: ");
		broder1.anoNascimento = leia.nextInt();
		
		System.out.printf("Oi %s, sua idade aproximada é %d anos!!!\n", broder1.nome, broder1.idade());
		
		System.out.println(broder1.statusIdade());
	}
}
