package desafio05_classes;

public class Desafio03_ProdutoEletronicoClass {
	
	public String descricao;
	public double pre�o;
	public int estoque;
	public int volts;
	
	
	public Desafio03_ProdutoEletronicoClass(String descricao, double pre�o) {
		super();
		this.descricao = descricao;
		this.pre�o = pre�o;
	}
	
	public void potenciaVolts() {
		
		String voltsPotencia;
		
		if(volts == 110  && volts == 220)
		{
			voltsPotencia = "Produto Bivolt";
		}else {
			voltsPotencia = "Produto n�o � Bivolt";
		}
	}
}
