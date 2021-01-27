programa
{
	inclua biblioteca Matematica --> mat

    funcao inicio()
    {
        real soma = 0.0, numerador = -1.0

        para (real denominador=1.0;denominador<= 50.0; denominador++)
        {
            numerador = numerador +  2.0
            soma = soma + (numerador/denominador)
        }
        escreva(mat.arredondar(soma, 2))
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */