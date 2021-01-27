programa
{
	inclua biblioteca Calendario --> cal
	
	funcao inicio()
	{
		inteiro ano, idade
		caracter sexo 
		cadeia nome	
		
		escreva("Escreva seu nome: ")
		leia(nome)
		escreva("Escreva seu sexo[M/F]: ")
		leia(sexo)
		escreva("Escreva seu ano de nascimento[AAAA]: ")
		leia(ano)

		idade = (cal.ano_atual()) - ano
		/*
		 * até 18 - jovem
		 * de 18 até 59 anos - adulto/a
		 * de 60 anos pra cima idoso/a
		 *
		 */

		se (sexo == sexo){
			
		se (sexo == 'M' ou sexo == 'm')
		{
			se(idade<18){
				escreva("Você se chama " + nome + " e sua idade aproximada é de " + idade + " anos e você é considerado jovem.")
			}
			senao se (idade<60){
				escreva("O Sr. se chama " + nome + " e sua idade aproximada é de " + idade + " anos e você é considerado adulto.")
			}
			senao 
			{
				escreva("O Sr. se chama " + nome + " e sua idade aproximada é de " + idade + " anos e você é considerado idoso.")
			}
		}
		senao se (sexo == 'F' ou sexo =='f')
		{
			se (idade<18){
				escreva("Você se chama " + nome + " e sua idade aproximada é de " + idade + " anos e você é considerada jovem.")
			}
			senao se (idade<60){
				escreva("Você se chama " + nome + " e sua idade aproximada é de " + idade + " anos e você é considerada adulta.")
			}
			senao
			{
				escreva("A Sra. se chama " + nome + " e sua idade aproximada é de " + idade + " anos e você é considerada idosa.")
			}		
		}
		
		senao se(sexo == 'X' ou sexo == 'x')
		{	
			se (idade<18){
				escreva("Você se chama " + nome + " e sua idade aproximada é de " + idade + " anos e você é considerado jovem.")
			}
			senao se (idade<60){
				escreva("O Srx se chama " + nome + " e sua idade aproximada é de " + idade + " anos e você é considerado adultx.")
			}
			senao
			{
				escreva("O Srx se chama " + nome + " e sua idade aproximada é de " + idade + " anos e você é considerado idosx.")
			}
		}
		senao{
			escreva("Ocorreu um erro nas informações")
		}
	}
		
		escreva("\nFIM DE PROGRAMA!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1444; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */