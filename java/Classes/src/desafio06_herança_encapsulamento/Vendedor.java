package desafio06_herança_encapsulamento;

public class Vendedor extends Pessoa {
	public double valorVendas;
	public double comissao;
	public Vendedor(String nome, String endereço, String telefone, double valorVendas, double comissao) {
		super(nome, endereço, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public void adicionado(double comissao)
	{
		comissao += valorVendas * 0.30; 
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	
}
