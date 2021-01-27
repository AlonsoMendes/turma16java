programa
{
	
	funcao inicio()
	{	
		inteiro numeroNatural
		
		escreva("Escreva um numero natural: ")
		leia(numeroNatural)

		se(numeroNatural % 2 == 0 e numeroNatural < 0){
			escreva("Esse numero é par")
		}
		senao se(numeroNatural == 0)
		{
			escreva("0 é um numero neutro")
		}
		senao se(numeroNatural < 0)
		{
			escreva("Desculpa esse numero nao é natural")	
		}	
		senao
		{
			escreva("Esse numero é impar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 167; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */