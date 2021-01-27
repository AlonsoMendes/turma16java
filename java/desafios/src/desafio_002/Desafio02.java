package desafio_002;

import java.util.*;

public class Desafio02 
{
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
				
		int a, b, c, maior = 0, menor = 0, meio = 0;

		System.out.print("Digite um valor inteiro: ");
		a = ler.nextInt();
		System.out.print("Digite outro valor inteiro: ");
		b = ler.nextInt();
		if(b > a) { //SE B FOR MAIOR QUE A ENTAO B SERA O MAIOR VALOR E A O MENOR
			maior = b;
			menor = a;			
		}else {  // SE NÃO A SERÁ O MAIOR VALOR E B O MENOR
			maior = a;
			menor = b;
		}
		System.out.print("Digite o último valor inteiro: ");
		c = ler.nextInt();
		if(c > maior) { // SE C FOR MAIOR QUE O MAIOR VALOR, ELE PASSA A SER O MAIOR VALOR E O ANTIGO MAIOR VALOR FICA NO MEIO 
			meio = maior;
			maior = c;
		} else if(c < menor){ // SE C FOR MENOR QUE O MENOR, O MENOR VIRA O MEIO E O C PASSA A SER O MENOR VALOR
			meio = menor;
			menor = c;
		}else{ // SE C FOR MAIOR QUE O MENOR ELE FICA NO MEIO	
			c = meio;			
		}
		System.out.printf("Ordem crescente é %d, %d, %d.", menor, meio, maior);
	}
}