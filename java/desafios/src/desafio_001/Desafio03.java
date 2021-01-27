package desafio_001;

import java.util.Scanner;

public class Desafio03 
{
	public static void main(String[] args) 
	{		
	Scanner ler = new Scanner(System.in);
	
	int  horas, minutos, segundos;
	
	System.out.println("Qual tempo de duração do evento: ");
	segundos = ler.nextInt();
	
	horas = segundos / 3600;
	minutos = (segundos % 3600) / 60;
	segundos = (segundos % 3600) % 60;
	
	System.out.println("O evento vai durar " + horas+" horas, " + minutos+ " minutos e " +segundos+ " segundos");

	}
}