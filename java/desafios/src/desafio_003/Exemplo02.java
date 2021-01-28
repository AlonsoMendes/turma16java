package desafio_003;

import java.util.*;

public class Exemplo02 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int contador = 0, valor = 0, somaTotal = 0;
		
		System.out.print("Digite o numero: ");
		valor = ler.nextInt();	
		
		do {
			contador++;
			if(contador <= 1) {
				System.out.print(contador);
			}
			else {
				System.out.printf(" + " +contador);
			}
			somaTotal += contador;
			
		}while(contador < valor);
			
		System.out.printf(" = %d", somaTotal);
	}
}
