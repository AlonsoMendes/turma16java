programa
{
	
	funcao inicio()
	{
		inteiro idade, dia, mes, ano

		escreva("Escreva a sua idade em anos: ")
		leia(ano)
		escreva("Quantos meses de vida: ")
		leia(mes)
		escreva("Quantos dias de vida: ")
		leia(dia)

		idade = (ano * 365) + (mes * 30) + dia
		escreva("O total de dias vividos: " +idade)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 309; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */