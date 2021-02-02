package aulas;

import java.util.*;
import formas.Triangulo;

public class CalculosFormas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		Triangulo tri1 = new Triangulo();
		Triangulo tri2 = new Triangulo();
		
		System.out.print("Digite a base do triangulo 1: ");
		tri1.base = leia.nextDouble();
		System.out.print("\nDigite a altura do triangulo 1: ");
		tri1.altura = leia.nextDouble();
		
		tri1.area();
		
		System.out.print("\nDigite a base do triangulo 2: ");
		tri2.base = leia.nextDouble();
		System.out.print("\nDigite a altura do triangulo 2: ");
		tri2.altura = leia.nextDouble();
		
		tri2.area();
		
	}

}
