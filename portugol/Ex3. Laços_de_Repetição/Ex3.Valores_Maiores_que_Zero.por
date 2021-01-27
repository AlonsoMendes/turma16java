/* Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
 * e apresente no final o total do somatório, a média e o total de valores lidos. 
 * O programa deve fazer as leituras dos valores enquanto o usuário estiver 
 * fornecendo valores positivos. Ou seja, o programa deve parar quando o 
 * usuário fornecer um valor negativo.
 */
programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	inteiro numeroFornecido = 0
		inteiro somaNumeros = 0
		real media
		inteiro valorLido = 0
	
		enquanto (numeroFornecido >= 0)
		{	
			escreva("Escreva um numero: ")
			leia(numeroFornecido)
			
			se (numeroFornecido > 0){
				somaNumeros += numeroFornecido
				valorLido++	
			}	
		}

		media = ((somaNumeros * 1.0) / (valorLido * 1.0))
		
		limpa()
		escreva("O total de numeros positivos escrito é " ,somaNumeros)
		escreva("\nEssa é a media dos numeros fornecidos " ,mat.arredondar(media, 1))
		escreva("\nO total de valores lidos é ",valorLido)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 981; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */