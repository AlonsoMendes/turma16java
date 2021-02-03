package desafio05_classes;

import java.util.*;

public class Desafio02_Aviao {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Desafio02_AviaoClass aviao = new Desafio02_AviaoClass("MEDIO", "COMERCIAL", "LIGADO");
		/*
		System.out.print("Qual a tipo do avião[ P- PEQUENO | M - MEDIO | G - GRANDE ]: ");
		aviao.tipoDeAviao = ler.next().toUpperCase();
		System.out.print("Qual a tipo da licença do aviao [ 1 - PP-A | 2 - PC-A | 3 - PLA-A ]: ");
		aviao.licenca = ler.nextInt();
		System.out.print("Qual o status do aviao [ 1- ligado | 2 - desligado ]: ");
		aviao.status = ler.nextInt();
		System.out.printf("Aviao de %s com licença %s, Status:  %s",aviao.categoriaDoAviao(), aviao.licencaDoAviao(), aviao.statusDoAviao());
		*/
		
		System.out.printf("Aviao de porte %s, %s e %s",aviao.tipoDeAviao, aviao.licenca, aviao.status);

	}

}
