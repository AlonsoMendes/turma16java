package desafio_001;

import java.util.Scanner;

public class Desafio07
{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float a, b, c, d, i , f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextFloat();
		System.out.println("Digite o valor de B: ");
		b = ler.nextFloat();
		System.out.println("Digite o valor de C: ");
		c = ler.nextFloat();
		System.out.println("Digite o valor de D: ");
		d = ler.nextFloat();
		System.out.println("Digite o valor de E: ");
		i = ler.nextFloat();
		System.out.println("Digite o valor de F: ");
		f = ler.nextFloat();
		
		x = ((c*i) - (b*f)) / ((a*i) - (b*d));
		y = ((a*f) - (c*d)) / ((a*i) - (b*d));

		//c = ((a*x)+(b*y));
		//f = ((d*x)+(i*y));
		
		System.out.println("Valor de X: " +x);
		System.out.println("Valor de Y: " +y);
	}
}
