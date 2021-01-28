package desafio_001;

import java.util.Scanner;

public class Desafio08 {
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in); 
			
				double custo, valorFinal;
				
				System.out.print("Digite o valor do carro na fábrica: ");
				custo = ler.nextDouble();
				
				valorFinal = (custo+(custo*0.28)+(custo*0.45));
				
				System.out.printf("Custo para o consumidor é %.2f.", valorFinal);
				
		}
}
