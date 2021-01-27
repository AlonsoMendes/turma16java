programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real salario, imposto
		caracter sexo
		cadeia nome


		escreva("Qual seu nome: ")
		leia(nome)
		escreva("Qual seu sexo [M , F]: ")
		leia(sexo)
		escreva("Qual o seu salario: R$ ")
		leia(salario)
		limpa()

		
		se (sexo == 'M' ou sexo == 'm')
		{
			se (salario <= 1100)
			{
				escreva("O Sr. ", nome, ", esta isento de impostos com o seu salario final é de R$ " ,mat.arredondar(salario, 2))
			} 
			senao se(salario > 1100 e salario <= 3500)
			{
				imposto = salario * 0.09
				salario = salario - imposto
				escreva("O Sr. ", nome, ", tem que pagar 9% de imposto igual a R$" ,mat.arredondar(imposto, 2), "\n e seu salario final é de R$ " ,mat.arredondar(salario, 2))
			} 
			senao se(salario > 3500 e salario <= 10000)
			{
				imposto = salario * 0.15
				salario = salario - imposto
				escreva("O Sr.", nome, ",  tem que pagar 15% de imposto igual a R$" ,mat.arredondar(imposto, 2), "\n e seu salario final é de R$ " ,mat.arredondar(salario, 2))
			}
			senao
			{
				imposto = salario * 0.27
				salario = salario - imposto
				escreva("O Sr.", nome, ", tem que pagar 27% de imposto igual a R$$" ,mat.arredondar(imposto, 2), "\n e seu salario final é de R$ " ,mat.arredondar(salario, 2))
				}
			}
		senao se (sexo == 'F' ou sexo == 'f')
		{
			se (salario <= 1100)
			{
				escreva("O Sra.", nome, ", esta isenta de impostos com o salario final de R$ " ,mat.arredondar(salario, 2))
			} 
			senao se(salario > 1100 e salario <= 3500)
			{
				imposto = salario * 0.09
				salario = salario - imposto
				escreva("O Sra.", nome, ", tem que pagar 9% de imposto igual a R$" ,mat.arredondar(imposto, 2), ",\n e seu salario final é de R$ " ,mat.arredondar(salario, 2))
			} 
			senao se(salario > 3500 e salario <= 10000)
			{
				imposto = salario * 0.15
				salario = salario - imposto
				escreva("O Sra.", nome, ", tem que pagar 15% de imposto igual a R$" ,mat.arredondar(imposto, 2), "\n e seu salario final é de R$ " ,mat.arredondar(salario, 2))
			}
			senao
			{
				imposto = salario * 0.27
				salario = salario - imposto
				escreva("O Sr.", nome, ", tem que pagar 27% de imposto igual a R$" ,mat.arredondar(imposto, 2), "\n e seu salario final é R$ " ,mat.arredondar(salario, 2))
			}
		}
		senao
		{
			escreva("Informações incorretas regerente ao sexo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */