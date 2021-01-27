programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
			real salario= 0.0, maiorSalario= 0.00, percentualSalario100 = 0.00
			real mediaSalario = 0.0, mediaFilhos = 0.0, salarioTotal = 0.0
			inteiro numeroFilhos = 0, totalFilhos = 0
			inteiro numeroPessoas = 3
			real contadorValor100 = 0
		
		para (inteiro x= 1; x <= numeroPessoas ; x++)
		{
			escreva("Digite o salario do habitante ",x, ": R$ ")
			leia(salario)
			escreva("Digite o numero de filho deste habitate " ,x, ": ")
			leia(numeroFilhos)

			salarioTotal = salario + salarioTotal
			totalFilhos = totalFilhos + numeroFilhos

			se (salario > maiorSalario)
			{
				maiorSalario = salario
			}
			se (salario <= 100)
			{
				contadorValor100++//Somando 1 a cada lop no total de pessoas com salario <= 100	
			}


		}
		
		mediaSalario = salarioTotal / numeroPessoas
		mediaFilhos = ((totalFilhos * 1.0) / (numeroPessoas * 1.0))
		percentualSalario100 = (contadorValor100 / numeroPessoas)* 100.00

		limpa()
		escreva("A media do salario da populacao e R$ ", mat.arredondar(mediaSalario, 2))
 	 	escreva("\nA media do numero de filhos e ", mat.arredondar(mediaFilhos, 1))
 		escreva("\nO maior salario e R$ ", mat.arredondar(maiorSalario, 2))
 		escreva("\nO percentual de pessoas com salario até 100 reais e de ", mat.arredondar(percentualSalario100, 2), "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1154; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */