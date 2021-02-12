package desafioecommerce;

public class Pessoa {
	private String nomePessoa;
	private String genero;
	private char sexo;
	//Construtores
	public Pessoa(String nomePessoa, String genero) {
		super();
		this.nomePessoa = nomePessoa;
		this.genero = genero;
	}
	
	
	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public Pessoa() {
		
	}
	
	//getters and setters
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
		public String tratamentoGenero(char sexo)
	    {
	        if (sexo == 'M')
	        {
	            return "Sr. ";
	        }
	        else if (sexo == 'F')
	        {
	            return "Sra. ";
	        }
	        else if (sexo == ' ')
	        {
	            return "";
	        }
	        else {
	            return "Sre. ";
	        }

	    }
							

}
