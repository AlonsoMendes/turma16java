programa
{
	
	funcao inicio()
	{
		real a, b, c, d, i , f, x, y

		escreva("Digite o valor de A: ")
		leia(a)
		escreva("Digite o valor de B: ")
		leia(b)
		escreva("Digite o valor de C: ")
		leia(c)
		escreva("Digite o valor de D: ")
		leia(d)
		escreva("Digite o valor de E: ")
		leia(i)
		escreva("Digite o valor de F: ")
		leia(f)

		
		x = ((c*i) - (b*f)) / ((a*i) - (b*d))
		y = ((a*f) - (c*d)) / ((a*i) - (b*d))

		//c = ((a*x)+(b*y))
		//f = ((d*x)+(i*y))
		
		escreva("Valor de X: " + x)
		escreva("\nValor de Y: " + y)
		
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