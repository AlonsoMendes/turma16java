package desafioecommerce;

public class Produto extends Pessoa {
	private String nomeProduto;
	private String codigo;
	private double precoProduto;
	private int estoque;

	public Produto(String nomePessoa, String genero, String nomeProduto, String codigo, double precoProduto,
			int estoque) {
		super(nomePessoa, genero);
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoProduto = precoProduto;
		this.estoque = estoque;
	}

	public Produto() {
		
	}
	

	public Produto(String codigo) {
		super();
		this.codigo = codigo;
	}

	public Produto(String nomeProduto, String codigo) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
	}

	public Produto(String nomeProduto, String codigo, double precoProduto, int estoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoProduto = precoProduto;
		this.estoque = estoque;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getNomePessoa() {
		super.getNomePessoa();
		return null;
	}
	
	
}
