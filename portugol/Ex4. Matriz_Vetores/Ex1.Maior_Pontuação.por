/*
 * Faça um programa que crie um vetor por leitura com 5 valores 
 * de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente. 
 */


programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[5], maiorPontuacao = 0

		para(inteiro x=0; x < 5; x++)
		{
			escreva("Escreva a nota da atividade: ")
			leia(pontuacao[x])

			se(pontuacao[x] > maiorPontuacao)
			{
				maiorPontuacao = pontuacao[x]
			}
		}
			escreva("A maior pontuação foi a ", maiorPontuacao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontuacao, 13, 10, 9}-{maiorPontuacao, 13, 24, 14};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */