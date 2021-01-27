	/*
	 * Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço 
	 * normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a 
	 * seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
	Código Condição de pagamento 
	1 À vista em dinheiro ou cheque, recebe 20% de desconto 
	2 À vista no cartão de crédito, recebe 15% de desconto 
	3 Em duas vezes, preço normal de etiqueta sem juros 
	4 Em três vezes, preço normal de etiqueta mais juros de 10%
	 */
 programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real pagamento = 0.0
		real valor = 0.0

		escreva("Qual o valor do produto : R$ ")
		leia(valor)

		escreva("FORMAS DE PAGAMENTOS\n")
		escreva("1- À vista em dinheiro ou cheque, recebe 20% de desconto ")
		escreva("\n2- À vista no cartão de crédito, recebe 15% de desconto ")
		escreva("\n3- Em duas vezes, preço normal de etiqueta sem juros ")
		escreva("\n4- Em três vezes, preço normal de etiqueta mais juros de 10%")
		
		
		escreva("\nQual forma de pagamento? ")
		leia(pagamento)
		
		
		se(pagamento == 1)
		{
			valor = (valor * 0.20) + valor 
			escreva("\nO valor do pagamento é ", mat.arredondar(valor, 2))
		}senao se(pagamento == 2)
		{
			valor = (valor * 0.15) + valor
			escreva("\nO valor do pagamento é ",  mat.arredondar(valor, 2))
		}senao se(pagamento == 3)
		{
			escreva("\nO valor do pagamento é ",  mat.arredondar(valor, 2))
		}senao se(pagamento == 4)
		{
			valor = (valor * 0.10) + valor
			escreva("\nO valor do pagamento é ",  mat.arredondar(valor, 2))
		}senao{
			escreva("Opção invalida")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */