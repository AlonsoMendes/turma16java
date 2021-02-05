package Collections;

import java.util.*;

public class TestesErro {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		try {
			
		System.out.println("Digite uma esguencia de nomes: ");
		String[] vetor = ler.nextLine().split(" "); //{"ed", "Alonso", "rafao"}
		
		System.out.println("Digite uma posicao na lista: ");
		int posicao = ler.nextInt();
		
		System.out.println("O nome na posição escolhida é " +vetor[posicao]);
		}

		catch(java.lang.ArrayIndexOutOfBoundsException erro)
		{
			System.out.println("Amigao, tu digitou um tamanho de indice errado");
		}
		catch(java.util.InputMismatchException erro) 
		{
			System.out.println("Amigao, digite numero.");
		}
		catch(Exception e){
			System.out.println("Você precisa digitar bem as informações !!");
		}
		finally
		{
			System.out.println("Isso ai Garotinhx !!");
		}
		System.out.println("Fim de programa!!!");
	}

}
