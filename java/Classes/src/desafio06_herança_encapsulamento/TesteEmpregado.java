package desafio06_herança_encapsulamento;

import java.util.*;


public class TesteEmpregado {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Empregado empregado = new Empregado("Alonso", "Rua XXX", "4002-8922", 777, 10.000, 0.15);
		
		
		System.out.print("Digite um codigo [1-Trabalhando|2-Ferias|3-Demitido]: ");
		empregado.codigoSetor = ler.nextInt();

		empregado.codigo();
		empregado.calcularSalario();
	}

}
