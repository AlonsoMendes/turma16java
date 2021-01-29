package desafio03_LacosRepeticao;

import java.util.*;

public class Desafio03 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, menor = 0, maior = 0;
		
		while(idade != -99) {
			
			System.out.print("Escreva sua idade: ");
			idade = ler.nextInt();
			
			if(idade < 21) {
				menor++;
			}else if(idade > 50) {
				maior++;
			}
		}
		System.out.printf("Total de pessoas com menos de 20 é %d e mais que 50 são %d.", menor, maior);
	}

}
