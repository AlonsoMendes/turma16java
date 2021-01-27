programa
{
	
	funcao inicio()
	{
	
		inteiro c, n, salario, extra, horasExtra
		
		escreva("Escreva seu codigo: ")
		leia(c)
		escreva("Escreva o numero de horas: ")
		leia(n)

		salario = n *10
		limpa()
		se(n > 50)
		{	
			extra = n - 50
			horasExtra = extra*20
			salario = 50 *10			
			escreva("Salário Total é R$ " , (salario+horasExtra), " com R$ ",horasExtra, " de Extra")
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
 * @POSICAO-CURSOR = 489; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */