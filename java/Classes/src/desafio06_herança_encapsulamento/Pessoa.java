package desafio06_heran�a_encapsulamento;

public class Pessoa {
	
	private String nome; 
	private String endere�o;
	private String telefone;
	
	public Pessoa(String nome, String endere�o, String telefone) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}
	
	public Pessoa()
	{
		//Construtor Patr�o
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndere�o() {
		return endere�o;
	}



	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public void dddPessoa(String ddd)
	{		
		if(telefone  == "11")
		{
			System.out.println("Mora em S�o Paulo");
		}
	}
	public void estadoPessoa(String estado) 
	{
		System.out.println("Esta VIVA!!");
	}
	
	
	
}