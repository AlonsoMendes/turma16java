/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um  vetor com os lançamentos, escreva 
 * esse vetor. A seguir determine e imprima a média aritmética dos 
 * lançamentos, contabilize e apresente também quantas foram as 
 * ocorrências da maior pontuação.
*/

programa
{
	funcao inicio()
	{
		inteiro dados[10], valorTotal = 0
		inteiro maiorValor = 0, contador = 0
		real media = 0.0

		para(inteiro x =0; x < 10; x++)
		{
			escreva("Digite o valor do dado: ")
			leia(dados[x])

			valorTotal += dados[x] 

			se(dados[x] > maiorValor)
			{
				maiorValor = dados[x]
				contador ++
			}			
		}

		media = valorTotal / 10.0
		
		escreva("Media é ", media)
		escreva("\nMaior valor é ", maiorValor, ", e o maior valor apareceu ", contador - 1)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */