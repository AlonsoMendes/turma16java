/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos 
 * deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada 
 * de dados deve terminar quando for lido um número negativo.
 */
programa
{
	
	funcao inicio()
	{
		inteiro numeros
		inteiro contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0

			escreva("Digite o numero: ")
			leia(numeros)

		enquanto(numeros >= 0 )
		{	
			escreva("Digite o numero: ")
			leia(numeros)
			
			se(numeros <= 25)
			{
				contador1++
			}senao se(numeros <=50)
			{
				contador2++
			}senao se(numeros <= 75)
			{
				contador3++
			}senao se( numeros <= 100){
				contador4++
			}senao {
				escreva("Numero invalido")
			}
			
		}
		limpa()
		escreva("GRUPO 1\t\tGRUPO 2\t\tGRUPO 3\t\tGRUPO 4")
		escreva("\n",contador1, "\t\t",contador2,"\t\t",contador3,"\t\t",contador4)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */