package desafio;

public class Roupa {
//Encapsulamento | Atriburo
	protected String tecido;
	protected String marca;
	protected String cor;
	
	
	public Roupa(String tecido, String marca, String cor) {
		super();
		this.tecido = tecido;
		this.marca = marca;
		this.cor = cor;
	}
	
	//metodo
	public void vestir() {
		System.out.println("A roupa foi vestida");
	}

	public String getTecido()//Recupa o valor do Atributo
	{
		return tecido;
	}

	public void setTecido(String tecido) // Modifica o valor do Atributo
	{
		this.tecido = tecido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


}
