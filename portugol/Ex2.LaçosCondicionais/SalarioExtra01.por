programa
{
	
	funcao inicio()
	{	
		inteiro c, n, salario = 0, extra
		
		escreva("Escreva seu codigo: ")
		leia(c)
		escreva("Escreva o numero de horas: ")
		leia(n)
		limpa()

		//salario = n * 10
		
		se (n > 50)
		{	
			salario = (n-1)*10
			extra = (n - 50) * 20 + salario
			escreva("O salario total é de R$ " ,(extra-10), " com R$ " ,(extra-salario), " de extra")
		}
		senao{
			extra = 0
			escreva("Seu salario é de R$ " ,salario, " com extra de R$ ",extra)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 61; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */