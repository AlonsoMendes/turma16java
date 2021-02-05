package desafio07_Polimorfismo;

import java.util.*;

public class Teste {
	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro("Luck", 10);
		Animal cavalo = new Cavalo("Junin", 6);
		Animal preguica = new Preguica("P", 15);
		
		System.out.printf("O som do cachorro: %s", cachorro.som());
		System.out.printf("\n %s",cachorro.movimentacao());
		System.out.printf("\nO som do cavalo: %s", cavalo.som());
		System.out.printf("\n %s",cavalo.movimentacao());
		System.out.printf("\nO som do preguiça: %s", preguica.som());
		System.out.printf("\n %s",preguica.movimentacao());
			
	}

}
