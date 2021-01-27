/* 	O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde 
 *  	para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula 
 *  	é IMC = peso / ( altura )2 
	Elabore um programa que leia o peso e a altura de um adulto e 
	mostre sua condição de acordo com a tabela abaixo. 
	IMC em adultos Condição 
	Abaixo de 18,5 Abaixo do peso 
	Entre 18,5 e 25 Peso normal 
	Entre 25 e 30 Acima do peso 
	Acima de 30 obeso
 */
 programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real peso = 0.0, altura = 0.0, imc = 0.0

		escreva("\tIMC: ÍNDICE DE MASSA CORPORAL\n")

		escreva("\nEscreva seu peso:")
		leia(peso)
		escreva("Escreva sua altura: ")
		leia(altura)


		imc = peso / mat.potencia(altura, 2.0)

		se(imc < 18.5){
			escreva("Você esta abaixo do peso e seu imc é ",mat.arredondar(imc, 2))
		}senao se(imc < 25){
			escreva("Você esta no peso normal e seu imc é ",mat.arredondar(imc, 2))
		}senao se(imc < 30){
			escreva("Você esta acima do seu peso normal e seu imc é ",mat.arredondar(imc, 2))
		}senao{
			escreva("Você esta obeso e seu imc é ",mat.arredondar(imc, 2) )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */