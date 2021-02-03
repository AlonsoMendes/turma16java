package desafio05_classes;

public class TesteProdutoClass {
	
	public int codigo;
	public String descricao;
	public double valorUnitario;
	
	public TesteProdutoClass(int codigo)
	{
		this.codigo = codigo;
	}
	public TesteProdutoClass(int codigo, String descricao)
	{
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public TesteProdutoClass(int codigo, String descricao, double valorUnitario)
	{
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}
}
