package desafio_002;

import java.util.Scanner;

public class Desafio02 
{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
				
		int a, b,c;
		
		System.out.print("Digite o primeiro numero: ");
		a = ler.nextInt();
		System.out.print("Digite o segundo numero: ");
		b = ler.nextInt();
		System.out.print("Digite o terceiro numero: ");
		c = ler.nextInt();
		
		if(a >  b && b > c) {
			System.out.printf("A seguencia é %d, %d, %d", c , b , a);
		}
		else if(b >  a && a > c) {
			System.out.printf("A seguencia é %d, %d, %d", c , a , b);
		}
		else if(a > b && c > b) {
			System.out.printf("A seguencia é %d, %d, %d", b , c , a);

		}else if (c > a && b > a){
			if(c > b) {
				System.out.printf("A seguencia é %d, %d, %d", a , b , c);
			}
			else {
				System.out.printf("A seguencia é %d, %d, %d", a , c , b);
			}
		}else {
			System.out.printf("A seguencia é %d, %d, %d", b , a , c);
		}
			
	}
}