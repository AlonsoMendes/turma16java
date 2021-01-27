package Treino;

import java.util.*;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int p, m;
		
		System.out.print("Digite o peso: ");
		p = ler.nextInt();
		
		if(p > 50) {
			m = (p - 50) * 4;
		System.out.printf("Excesso de peso ,voce tem que pagar a multa de R$ %d." ,m);
				}
		else if(p <= 50 )
				{
		System.out.print("Não a multa a se pagar");
				}
	}
}
