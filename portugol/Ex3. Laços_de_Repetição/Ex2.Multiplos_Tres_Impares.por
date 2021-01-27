programa
{
	
	funcao inicio()
	{	
		inteiro  totalImpar = 0
				 		
		para(inteiro  impar = 1; impar<= 500; impar++)
		{
			se((impar % 2) == 1 e (impar % 3) == 0)
			{
				totalImpar += impar
			}		
		}
		escreva("O total de  multiplos de 3 impares é igual a ", totalImpar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 106; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */