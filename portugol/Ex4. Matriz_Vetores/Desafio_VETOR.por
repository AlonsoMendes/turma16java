/*PAULISTINHA
 * CORINTHIANS, PALMEIRAS, SANTOS, SPFC
 * PONTOS - INTEIRO - 4
 * GANHA - 3 PONTOS
 * PERDE - 0 PONTOS
 * EMPATA - 1 PONTO
 * FAÇA UM PROGRAMA QUE PEÇA SE O CADA TIME F-GANHOU, P-PERDEU
 * OU EMPATOU EM 4 RODADAS, AO FINAL MOSTRAR O NOME DE CADA TIME
 * E SEUS RESPECTIVOS PONTOS
 * EX: SPFC - G- ganhou P-perdeu ou E-empatou[G/P/E]:
 */

programa
{
	
	funcao inicio()
	{
		cadeia times[] = {"CORINTHIANS", "PALMEIRAS", "SANTOS", "SPFC"}
		caracter informacao[] = {'G', 'P', 'E'}
		inteiro pontos[] = {3, 0, 1} 
		

		para (inteiro x=0; x<4; x++)
		{
			escreva("O Time G-ganhou, P-perdeu OU E-empatou: ")
			leia(pontos[x])
		}
		escreva("O time ", times[0], " tem ", pontos[x])	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 697; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */