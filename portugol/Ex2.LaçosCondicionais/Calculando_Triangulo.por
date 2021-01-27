programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real altura, base, triangulo

		escreva("Digite a base do triângulo: ")
		leia(base)
		escreva("Digite a altura do triângulo: ")
		leia(altura)
		limpa()

		se (base > 0.00 e altura > 0.00)
		{
			triangulo =  ((base * altura) / 2 )
			escreva("A area do triangulo é: ",mat.arredondar(triangulo, 2))
		}
		senao
		{
			escreva("Você digitou um numero negativo ou zero na base ou altura !!")

		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */