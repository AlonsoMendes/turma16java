programa
{
	
	funcao inicio()
	{
		cadeia nomeAlunos[4]
		inteiro notaAlunos[4]
		/*
		nomeAlunos[0]="Andressa"
		nomeAlunos[1]="Bianca"
		nomeAlunos[2]="Carol"
		nomeAlunos[3]="Denise"
		*/

		para(inteiro x=0; x<4; x++)
		{
			escreva("Digite o nome do aluno: ")
			leia(nomeAlunos[x])
			escreva("Digite a nota do aluno: ")
			leia(notaAlunos[x])
		}
			
		para(inteiro x=0; x<4; x++)
		{
		limpa()
		escreva("o nome do aluno é ", nomeAlunos[x]," e sua nota é ", notaAlunos[x],"\n")
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 494; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */