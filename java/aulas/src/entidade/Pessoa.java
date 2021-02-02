package entidade;

public class Pessoa {

	public String nome;
	public char generoPessoa;
	public int anoNascimento;
	public boolean estaViva;
	

	public Pessoa(String nome) 
	{
		this.nome = nome;
	}
	
	public Pessoa(String nome, boolean estaViva)
	{
		this.nome = nome;
		this.estaViva = estaViva;
	}
		
	public int idade()
	{
		return 2021 - anoNascimento;
	}

	public String statusIdade()
	{	
		String mensagem;
		int idade;
		
		idade = 2021 - anoNascimento;
		
		if(idade < 18)
		{
			mensagem = " menor que 18 anos, você não pode comprar revistas pornograficas";
		}else {
			mensagem = " maior que 18 anos, pode comprar qualquer revista";
		}
		
		return mensagem;
	}
	
	public String genero()
	{
		String mensagem1;
		
		if(idade() > 18 ) {
			
		if(generoPessoa == 'M' )
		{
			mensagem1 = "Sr";
		}else if(generoPessoa == 'F' )
		{
			mensagem1 = "Sra";
		}else {
			mensagem1 = "Srx";
			}
		}else {
			mensagem1 = "Você";
		}
		
		return mensagem1;
	}

}
