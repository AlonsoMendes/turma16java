package desafio;

public class ClasseGeral {

	protected String tecido;
	protected String marca;
	protected String cor;
	
	public ClasseGeral(String tecido, String marca, String cor) {
		super();
		this.tecido = tecido;
		this.marca = marca;
		this.cor = cor;
	}
	
	public void vestir() {
		System.out.println("A roupa foi vestida");
	}

	public String getTecido() {
		return tecido;
	}

	public void setTecido(String tecido) {
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


