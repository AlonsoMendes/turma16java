programa
{
	
	funcao inicio()
	{
		inteiro numeroAlunos = 4
		real notasAlunos = 0.0, maiorNota = 0.0
		cadeia nomeAluno = "", melhorAluno = ""

		para(inteiro x = 0; x < numeroAlunos; x++)
		{	
			escreva("Escreva seu Nome: ")
			leia(nomeAluno)
			escreva("Escreva sua nota: ")
			leia(notasAlunos)
			
			se(notasAlunos > maiorNota)
			{	
				maiorNota = notasAlunos
				melhorAluno = nomeAluno
			}			
		}
		escreva("A maior nota foi do aluno ", melhorAluno, " é sua nota foi ", maiorNota)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 149; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */