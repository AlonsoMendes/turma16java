package aulas;

import java.util.*;

public class ExemploLaco {
	
	public static void main(String[] args) 
	{
		
		/*DESVIO CONDICIONAL
		 * se - if 
		 * escolha caso - switch
		 * 
		 * fun��o - static void / alguma coisa//sub programas
		 */
		
		/*LA�OS -> LOOP
		 * para
		 * enquanto 
		 * fa�a enquanto
		 * 
		 * para (inteiro x=1; x<=60; x++)
		 * {
		 * escreva("-")
		 * }
		 */
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um numero para fazer a linha: ");
		int valor = ler.nextInt();
		
		
		for(int x=1; x<=valor;x++)
		{
			System.out.print("-");
		}
		
		
	}

}
