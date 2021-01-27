/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3,  
	e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal,
	ou seja, diagonal principal.
*/

programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], soma = 0, diagonal = 0

		para(inteiro x=0; x < 3; x++)
		{
			para(inteiro y=0; y < 3; y++)
			{
				escreva("Escreva o valor: ")
				leia(matriz[x][y])

				soma += matriz[x][y]

				se (x == y)
				{
					diagonal += matriz[x][y]
				}			
			}
		}
		//diagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]

		escreva("A soma dos valores da primeira diagonal é ", diagonal, " soma total da matriz é ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 512; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 11, 10, 6}-{soma, 11, 24, 4}-{diagonal, 11, 34, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */