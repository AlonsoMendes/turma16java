package Treino;

import java.util.*;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int codigo, horas, salario = 0, extra =0;
		
		System.out.print("Escreva seu codigo: ");
		codigo = ler.nextInt();
		System.out.print("Escreva o numero de horas: ");
		horas = ler.nextInt();
		
		if(horas > 50){
			salario = (horas-1)*10;
			extra = (horas - 50)* 20 + salario;
			System.out.printf("O salario total é de R$ %d com R$ %d de extra", (extra-10), (extra-salario));
		} else {
			extra = 0;
			System.out.printf("Seu salario é de R% %d com extra de %d", salario, extra);
		}
	}
}
