package desafio05_classes;

public class Desafio03_ProdutoEletronicoClass {
	
	public String descricao;
	public double preço;
	public int estoque;
	public int volts;
	
	
	public Desafio03_ProdutoEletronicoClass(String descricao, double preço) {
		super();
		this.descricao = descricao;
		this.preço = preço;
	}
	
	public void potenciaVolts() {
		
		String voltsPotencia;
		
		if(volts == 110  && volts == 220)
		{
			voltsPotencia = "Produto Bivolt";
		}else {
			voltsPotencia = "Produto não é Bivolt";
		}
	}
}
