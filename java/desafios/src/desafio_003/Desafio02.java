package desafio_003;

import java.util.*;

public class Desafio02 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int numero = random. nextInt(10)+1 , par = 0, impar = 0;
		
		for(int x = 0; x < numero; x++)
		{
			if(numero % 2 == 0) {
				par++;
			}else{
				impar++;
			}
		}
		System.out.printf("A quantidade de numeros pares é %d e de impares é %d.", par,impar);
	}

}
