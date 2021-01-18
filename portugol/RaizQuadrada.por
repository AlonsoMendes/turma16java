programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
			real x1, y1, x2, y2, raiz, valor
			

			escreva("Escreva o valor de x1: ")
			leia(x1)
			escreva("Escreva o valor de y1: ")
			leia(y1)
			escreva("Escreva o valor de x2: ")
			leia(x2)
			escreva("Escreva o valor de y2: ")
			leia(y2)

			valor = mat.potencia(x2-x1, 2.0) + mat.potencia(y2-y1, 2.0)
			raiz = mat.raiz(valor, 2.0)

			
			escreva("O resultado da expressão é: "+ raiz)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */