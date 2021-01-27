programa
{
	
	funcao inicio()
	{
		cadeia alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS","ATHOS GIOM DE PAIVA MESQUITA","C NDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA","DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA","DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS","FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN","GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS","JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI","KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT","LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS","MARIA NAZARE CORTEZ LIMA","MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI","MILTON JUNIOR CAVALCANTE DA PENHA","NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI","RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}
		cadeia codigo[40]
		inteiro notas[40]
		caracter opcao = '1'
		cadeia situacao 
		inteiro n = 0
		
		escreva("CODIGO\tALUNOS\n")
		para(inteiro x = 0; x < 40; x++)
		{
			codigo[x] = "G" + (x+1)
			escreva(codigo[x],"\t", alunos[x], "\n")
		}
			enquanto (opcao == '1')	
			{	
			 	escreva("Escreva a matricula do aluno :")
			 	leia(codigo[n])
			 	
				escreva("Digite a nota do aluno: ")
				leia(notas[n])				
			 	
			 	se(notas[n] < 0.0 ou notas[n] > 10.0)
			 	{
			 		escreva("Nota invalida: digite uma nota de [0-10]")
		 	}
		 	
			 escreva("Continua 1-sim ou 2-não: ")
			 leia(opcao)	 
			}
			
			limpa() 
			escreva("CODIGO\tSITUAÇÃO\tNOTAS\tALUNOS\n")
			 // LOOP PARA IMPRIMIR O NOME, MATRICULO E NOTAS
			/*LISTA OS ALUNOS NOVAMENTE COM A NOTA E COM A SITUAÇÃO APROVADO SE NOTA ACIMA DE 8, 
			 * EM ANALISE SE NOTA ENTRE 5 E 8, REPROVADO SE ABAIXO DE 5.
			 */
		 	para (inteiro x=0;x<40;x++)
		 	{
				se(notas[x] > 8){
					situacao = "Aprovado"
				}senao se(notas[x] >= 5 e notas[x] <= 8){
					situacao = "Em Analise"
				}senao{
					situacao = "Reprovado"
				} 		
		 		codigo[x] = "G-"+(x+1)
		 		escreva(codigo[x],"\t",situacao,"\t", notas[x] ,"\t", alunos[x], "\n")	
		 	 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1484; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */