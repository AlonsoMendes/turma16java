package Collections;

import java.io.File; // INPUT - OUTPUT == ENTRADA E SAIDA
import java.io.IOException;
import java.util.Scanner;

public class TesteFile {
	
	public static void main(String[] args) {
		
		File arquivo = new File("C:\\temp\\lista.txt");
		Scanner ler = null;
		try
		{
			ler = new Scanner(arquivo);
			while(ler.hasNextLine())
			{
				System.out.println(ler.nextLine());
			}
		}
		catch (IOException erro)
		{
			System.out.println("Erro na abertura do arquivo.");
		}
		finally
		{
			if(ler != null)
			{
				ler.close();
			}
		}
		
	}
}
