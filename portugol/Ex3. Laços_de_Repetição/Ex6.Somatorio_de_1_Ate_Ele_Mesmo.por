
programa
{
	
	funcao inicio()
	{
	  inteiro numero
	  inteiro soma = 1
	  inteiro contador = 0
	  
	  escreva("Escreva qualquer numero: ")
	  leia(numero)
	
	faca
	{	
		contador ++
		// escreva(soma,"\n")
		soma += contador
		
		se(numero <= 0)
		{
			soma = 0	
		}
		
	}enquanto(contador < numero)
	escreva(soma-1)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */