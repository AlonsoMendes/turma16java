package desafio03_LacosRepeticao;

import java.util.Scanner;

public class Exemplo01 {
	
		public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double salario= 0.0, maiorSalario= 0.0, percentualSalario100 = 0.0, mediaSalario = 0.0; 
		double contadorValor100 = 0.0, mediaFilhos = 0.0, salarioTotal = 0.0;
		int numeroFilhos = 0, totalFilhos = 0;
		final int numeroPessoas = 3;
		
		
		for(int x =1; x <= numeroPessoas; x++) 
		{
			System.out.print("Digite o salario do habitante R$ ");
			salario = ler.nextDouble();
			System.out.print("Digite o numero de filho deste habitantes: ");
			numeroFilhos = ler.nextInt();
			
			salarioTotal += salario;
			totalFilhos += numeroFilhos;
			
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}else if(salario <= 100) {
				contadorValor100++;
			}
		}			
			mediaSalario = salarioTotal / numeroPessoas;
			mediaFilhos = ((totalFilhos) / (numeroPessoas));
			percentualSalario100 = (contadorValor100 / numeroPessoas)* 100;
			
			System.out.printf("A media do salario da populacao e R$ %.2f", mediaSalario);
			System.out.printf("\nA media do numero de filhos e %.2f", mediaFilhos);
			System.out.printf("\nO maior salario e R$ %.2f", maiorSalario);
			System.out.printf("\\nO percentual de pessoas com salario até 100 reais e de R$ %.2f", percentualSalario100);		
	}

}
