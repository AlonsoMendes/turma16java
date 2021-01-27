programa
{
	
	funcao inicio()
	{	
		
		real p, m
		cadeia ee = "Excesso"

		escreva("Quantos kilos de tomate voce tem: ")
		leia(p)
		
		se (p > 50){
			m = (p - 50) * 4
			escreva(ee," ,voce tem que pagar a multa de: " ,m)
		}
		senao se(p <= 50 )
		{
			escreva("Não a multa a se pagar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 174; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */