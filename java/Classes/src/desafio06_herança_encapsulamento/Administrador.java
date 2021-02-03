package desafio06_herança_encapsulamento;

public class Administrador extends Pessoa {
	
	public double ajudaDeCusto;

	public Administrador(String nome, String endereço, String telefone, double ajudaDeCusto) {
		super(nome, endereço, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	

}
