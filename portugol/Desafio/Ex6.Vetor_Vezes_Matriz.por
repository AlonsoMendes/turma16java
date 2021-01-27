/*
 * Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 
 * elementos. Em seguida o programa deve fazer a multiplicação do vetor 
 * pelas colunas da matriz.
 */

programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro vetor[3]
		inteiro valor[3][3]
		
		para(inteiro l = 0; l < 3; l++)
		{
			para(inteiro c = 0; c < 3; c++)
			{
			escreva("Escreva a matriz : ")
			leia(matriz[l][c])
			}

		}

		para(inteiro v = 0; v < 3; v++)
		{
			escreva("Escreva o vetor: ")
			leia(vetor[v])
		}

		limpa()
		escreva("VETOR VEZES A MATRIZ1")
		para(inteiro m = 0; m<3; m++)
		{
			para(inteiro n =0; n <3; n++)
			{
				valor[m][n] = vetor[m] * matriz[m][n]

				escreva(valor[m][n],"\n")
			}
			
			
		}
		

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 715; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 12, 10, 6}-{vetor, 13, 10, 5}-{valor, 14, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */