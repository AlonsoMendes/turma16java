package empresa;

import java.util.*;

public class Exemplo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		List<Empregado> lista = new ArrayList<>();
		
		System.out.println("Numero de empregados: ");
		int numero = ler.nextInt();
		
		for(int x = 0; x<=numero; x++) {
		System.out.printf("Funcionario %d",(x+1));
		System.out.print("\nTerceiro [S - sim| N- não]: ");
		char op = ler.next().toUpperCase().charAt(0);
		System.out.print("Digite o nome do funcionario: ");
		String nome = ler.next();
		System.out.print("Digite a matricula do funcionario: ");
		int matricula = ler.nextInt();
		System.out.print("Digite a quantidade de horas trabalhada: ");
		int horasTrabalhada = ler.nextInt();
		System.out.print("Valor por hora: R$ ");
		double valorPorHora = ler.nextDouble();		
		
		
		if(op == 'S') {
			System.out.print("Digite o valor do acrescimo do funcionario: ");
			double acrescimo = ler.nextDouble();
			lista.add(new Terceiro(nome, matricula, horasTrabalhada, valorPorHora, acrescimo));
		}
		else if(op == 'N') {
			lista.add(new Empregado(nome, matricula, horasTrabalhada, valorPorHora));
			}
		}
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for(Empregado emp: lista)
		{
			System.out.println(emp.getNome() + " - R$ "+ String.format("%.2f", emp.salario()));
		}
		
	}	

}
