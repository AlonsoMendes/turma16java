package desafio06_heran�a_encapsulamento;

public class Administrador extends Pessoa {
	
	public double ajudaDeCusto;

	public Administrador(String nome, String endere�o, String telefone, double ajudaDeCusto) {
		super(nome, endere�o, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	

}
