/* Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/


programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro numero1, numero2, numero3, numero4
		
		escreva("Escreva o numero do primeiro quadrado: ")
		leia(numero1)
		escreva("Escreva o numero do segundo quadrado: ")
		leia(numero2)
		escreva("Escreva o numero do terceiro quadrado: ")
		leia(numero3)
		escreva("Escreva o numero do quarto quadrado: ")
		leia(numero4)
		limpa()


		se (mat.potencia(numero3, 2) >= 1000)
		{
			numero3 = (mat.potencia(numero3, 2))
			escreva(numero3)
		}

		senao{
			escreva("O primeiro quadrado é igual a " ,mat.potencia(numero1, 2))
			escreva("\nO segundo quadrado é igual a " ,mat.potencia(numero2, 2))
			escreva("\nO terceiro quadrado é igual a " ,mat.potencia(numero3, 2))
			escreva("\nO quarto quadrado é igual a " ,mat.potencia(numero4, 2))
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 770; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */