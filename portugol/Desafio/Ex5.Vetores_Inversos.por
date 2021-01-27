/*
 * Faça um programa que leia um vetor de 5 posições para números 
 * reais e, depois, um código inteiro. Se o código for zero, finalize 
 * o programa; se for 1, mostre o vetor na ordem direta; se for 2, 
 * mostre o vetor na ordem inversa. Caso, o código for diferente de 
 * 1 e 2, escreva uma mensagem informando que o código inválido.
 
 */
 programa
{
	
	funcao inicio()
	{
		real vetor[]= {1.2, 1.3 ,1.4 ,1.5 ,1.6}
		inteiro codigo = 0


		escreva("ESCREVA UM CODIGO [1 , 2]: ")
		leia(codigo)

		se(codigo != 1 e codigo != 2)
		{
			escreva("CODIGO INVALIDO")
		}senao se(codigo == 1)
		{
			escreva(vetor[0],"\t",vetor[1],"\t",vetor[2],"\t",vetor[3],"\t",vetor[4] )
		}senao{
			escreva(vetor[4],"\t",vetor[3],"\t",vetor[2],"\t",vetor[1],"\t",vetor[0] )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 766; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 14, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */