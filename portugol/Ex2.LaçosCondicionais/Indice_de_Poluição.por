//O índice de poluição aceitável varia de 0,05 até 0,25. 

programa
{
	
	funcao inicio()
	{
		real indice

		escreva("Qual o indice de popuição atual: ")
		leia(indice)

		se(indice == 0.3){
			 escreva("Grupo 1° esta sendo intimado a suspenderem suas atividades")
		}
		senao se(indice == 0.4)
		{
			 escreva("Grupos 1° e 2° estão sendo intimados a suspenderem suas atividades")
		}
		senao se(indice >= 0.5)
		{
			 escreva("Grupos 1°, 2° e 3° estão sendo intimados a suspenderem suas atividades")
		}
		senao se (indice >= 0.05 e indice < 0.25 )
		{
			escreva("Poluição estavel no momento")
		}
		senao se(indice >= 0.26 e indice < 0.3)
		{
			escreva("A poluição esta ficando perigosa")	
		}
		senao
		{
			escreva("Popuição minima")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 748; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */