package Ecommerce;

public class Estoque {

	
	private String descricao;
	private double quantidade;	
	
	Produto po = new Produto();
	

	public double BaixaProduto(double debito) {
		if(this.quantidade<=0 && this.quantidade>=10) {
			this.quantidade = quantidade; 
		}else {
			quantidade = (quantidade - debito);	
		}
		return quantidade;
	}
	
	public double CreditoProduto(double credito) {
		if(this.quantidade<=0 && this.quantidade>=10) {
			this.quantidade = quantidade; 
		}else {
			quantidade = (quantidade + credito);	
    	}
		return quantidade;
	}
	
	public double MostrarQuantidade() {
		 double mostrar = (10-quantidade);
		 return mostrar;
	}
	
	public Estoque() {
		
	}
	
	public Estoque(String descricao, double quantidade) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
