package desafios;

import java.util.Scanner;

public class Desafio04 
{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, r, s;
		
		System.out.println("Escreva o valor de a: ");
		a = ler.nextInt();
		System.out.println("Escreva o valor de b: ");
		b = ler.nextInt();
		System.out.println("Escreva o valor de c: ");
		c = ler.nextInt();
				
		r = (a+b) * (a+b);
		s = (b+c)*(b+c);
		d = ((r+s)/2);
		
		System.out.println("O valor da expressão é: " +d);
	}
}
