 /* Informar todos os números de 1000 a 1999 que quando 
    divididos por 11 obtemos resto = 5. (FOR)*/
package desafio_003;

public class Desafio01 {
	
	public static void main(String[] args) {
		
		int numero = 1999, contador = 0;
		
		for(int x = 1000; x < numero; x++)
		{
			if( x % 11 == 5) {
				System.out.println(x);
				contador++;
			}
		} 
		System.out.printf("O total de numero divididos por 11 obtendo resto 5 é %d.", contador);
	}
}
