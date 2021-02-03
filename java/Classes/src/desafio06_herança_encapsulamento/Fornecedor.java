package desafio06_herança_encapsulamento;

public class Fornecedor extends Pessoa {
	
	public double valorCredito;
	public double valorDivida;
	
	public Fornecedor(String nome, String endereço, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo()
	{	
		double dife = valorCredito - valorDivida;
		
		return dife;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

}
