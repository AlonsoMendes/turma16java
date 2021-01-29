package desafio03_LacosRepeticao;

import java.util.*;

public class Desafio04 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, sexo, humor, maior = 0, menor = 0, contadorCalmo= 0, x = 0;
		int contadorAgressivo = 0,contadorNervosa= 0, outros = 0;
		
		while(x < 150) {
			x++;
			
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			System.out.print("Digite seu sexo (1-feminino / 2-masculino / 3-Outros): ");
			sexo = ler.nextInt();
			System.out.print("Como esta se sentindo hoje (1-calma / 2-nervosa / 3-agressiva): ");
			humor = ler.nextInt();
			System.out.println();
			
			if(humor == 1) { 	
				contadorCalmo++;
				if(sexo == 3) { 
					outros++;
				}
			}
			else if(idade > 40) { 
				if(humor == 2) {
					maior++;
				}
				else if(sexo == 1) {
					if(humor == 2) {
						contadorNervosa++;
					}
				}
				else if(sexo == 2) {
					if(humor == 3) {
						contadorAgressivo++;
					}
				}
			}
			
			else if(idade < 18 && idade > 0) {
				if(humor == 1) {
					menor++;
				}
				
				else if(sexo == 1) {
					if(humor == 2) {
					contadorNervosa++;
				}
			}
				else if(sexo == 2) {
					if(humor == 3) {
					contadorAgressivo++;
					}
				}
			}
		}
		
		System.out.printf("o número de pessoas calmas é %d.", contadorCalmo);
		System.out.printf("\no número de mulheres nervosas é %d", contadorNervosa);
		System.out.printf("\no número de homens agressivos é %d.", contadorAgressivo);
		System.out.printf("\no número de outros calmos é %d.", outros);
		System.out.printf("\no numero de pessoas nervosas com mais de 40 anos é de %d.", maior);
		System.out.printf("\no numero de pessoas calmas com menor de 18 anos é de %d.", menor);

	}
}
