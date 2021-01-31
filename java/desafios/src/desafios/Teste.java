package desafios;

import java.util.*;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double saldoFinal = 0.0, valor = 0.0, debito = 0.0;
		char selecao, opcao, movimento,opcao2;
	
        do
        {
            System.out.print("\nSelecione o movimento [D/C]: ");
            movimento = leia.next().toUpperCase().charAt(0);

		
        if (movimento == 'D')
        {
        	
        	
        	
        	
        	
         }	
        System.out.print("\nDeseja continuar? [S/N]: ");
        opcao = leia.next().toUpperCase().charAt(0);

        }while(opcao == 'S');
	}
}
