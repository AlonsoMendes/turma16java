package desafios;

import java.util.*;

public class DesafioTriangulo {
	
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US); //define o tipo de padronização
	
	Scanner leia = new Scanner(System.in);//instaciar = criar
	
	
	double base, altura, area, maior = 0.0;

	for(int x = 0; x < 3; x++) {
		System.out.print("Digite a base do triangulo: ");
		base = leia.nextDouble();
		System.out.print("Digite a altura do triangulo: ");
		altura = leia.nextDouble();
		area = ((base * altura) / 2 );
		System.out.printf("A area do triangulo informado é %.2f\n", area);
		
		if (area > maior) {
			maior = area;
		}
	}
	System.out.printf("A maior area do triangulo informado é %.2f", maior);
	}
	/*do {
	System.out.print("Digite a base do triangulo: ");
	base = leia.nextDouble();
	System.out.print("Digite a altura do triangulo: ");
	altura = leia.nextDouble();
	x++;
	area = ((base * altura) / 2 );
	System.out.printf("A area do triangulo informado é %.2f\n", area);
	
	if (area > maior) {
		maior = area;
	}
	}while(x < 3);*/
}
