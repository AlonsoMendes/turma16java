package aulas;

import java.util.*;

public class TesteCodigoTernario
{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Digite o numero positivo: ");
		valor = ler.nextInt();
		// Ternario
		//System.out.println(((valor%2)==0)?"O numero � par":"O numero � impar");
		System.out.print((valor == 0 ) ? " Zero � neutro " : (valor < 0 ) ? " Valor � negativo " : (valor % 2 == 0 ) ? " Valor � par " : " Valor � impar " );
		
	}
}
