package desafio06_herança_encapsulamento;

public class Pessoa {
	
	private String nome; 
	private String endereço;
	private String telefone;
	
	public Pessoa(String nome, String endereço, String telefone) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}
	
	public Pessoa()
	{
		//Construtor Patrão
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereço() {
		return endereço;
	}



	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
			System.out.println("Mora em São Paulo");
		}
	}
	public void estadoPessoa(String estado) 
	{
		System.out.println("Esta VIVA!!");
	}
	
	
	
}