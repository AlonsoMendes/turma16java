package desafio06_herança_encapsulamento;

public class Operario {
	
	public double valorProducao;
	public double comissao;
	
	public Operario(double valorProducao, double comissao) {
		super();
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public void produzido(double valorMonetario)
	{
		valorMonetario = valorProducao;
	}
	
	public void adicionado(double salario)
	{
		salario += valorProducao * 0.30; 
	}
	

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	
	
}
