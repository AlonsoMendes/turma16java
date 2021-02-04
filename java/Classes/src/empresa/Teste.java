package empresa;

import java.util.*;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		

		System.out.print("Digite o nome do funcionario: ");
		String nome = ler.next();
		System.out.print("Digite a matricula do funcionario: ");
		int matricula = ler.nextInt();
		System.out.print("Digite a quantidade de horas trabalhada: ");
		int horasTrabalhada = ler.nextInt();
		System.out.print("Valor por hora: R$ ");
		double valorPorHora = ler.nextDouble();		
		System.out.println("Terceiro [S - sim| N- não]: ");
		char op = ler.next().toUpperCase().charAt(0);
		
		if(op == 'S') {
			System.out.print("Digite o valor do acrescimo do funcionario: ");
			double acrescimo = ler.nextDouble();
			Empregado func1 = new Terceiro(nome, matricula, horasTrabalhada, valorPorHora, acrescimo);
			System.out.printf("Salario com acrescimo %.2f", acrescimo);
			
		}
		else {
			Empregado func1 = new Empregado(nome, matricula, horasTrabalhada, valorPorHora);
			System.out.printf("Nome: %s ", nome);
			System.out.printf("Matricula: %d ", matricula);
			System.out.printf("Horas Trabalhada: %d ", nome);
			System.out.printf("Valor por Hora: R$ %.2f ", nome);
			}
	}
			
}
