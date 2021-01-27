/*
 * 1- Faça um programa que mostre uma contagem na tela de 233 a 456, 
 * só que contando de 3 em 3 quando estiver entre 300 e 400 e 
 * de 5 em 5 quando não estiver.
 */

programa
{
	
	funcao inicio()
	{
		inteiro numeroMenor = 233

		faca 
		{			
			se(numeroMenor < 300)
			{
				escreva("\n",numeroMenor)
				numeroMenor ++
			}	
			
			senao se(numeroMenor >= 300 e numeroMenor < 400)
			{
				escreva("\n", numeroMenor)
				numeroMenor = numeroMenor + 3
			}
			senao se(numeroMenor >= 400)
			{
				escreva("\n",numeroMenor)
				numeroMenor = numeroMenor + 5
			}	

		}enquanto(numeroMenor < 456)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */