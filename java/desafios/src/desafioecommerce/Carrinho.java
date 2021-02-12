package desafioecommerce;

import java.util.*;


public class Carrinho extends Produto  {
	//atributos
	private List<Produto> carrinhoCliente = new ArrayList<Produto>();
	Loja loja = new Loja();
	private int quantidadeProdutos;
	Scanner leia = new Scanner(System.in);
	
	//Produto prod = new Produto();
	// construtores;

	public Carrinho() {
		
	}
	public Carrinho(String nomePessoa, String genero, String nomeProduto, String codigo, double precoProduto,
			int estoque, int quantidadeProdutos) {
		super(nomePessoa, genero, nomeProduto, codigo, precoProduto, estoque);
		this.quantidadeProdutos = quantidadeProdutos;
	}

	// getters and setters
	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}
	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}
	
	public void devolverEstoque(int quantidade)
	// devolver a quantidade no estoque da loja
	{
		this.quantidadeProdutos -= quantidade;
		super.setEstoque(quantidade + super.getEstoque());
			
	}
	
	public void tirarEstoque()
	// subtrair do estoque da loja e adicionar no carrinho
	{
		int sub;
		
		if (carrinhoCliente.isEmpty()) {
			System.out.println("ta vazio");
		} else {
				
				for (int i=0; i < carrinhoCliente.size(); i++) {

        			System.out.println("Qual produto a ser removido: ");
        			String codigo = leia.nextLine().toUpperCase();

        			      carrinhoCliente.remove(i);
		    
        				for(Produto g : carrinhoCliente) {
				System.out.println(g.getCodigo() + g.getNomeProduto() + quantidadeProdutos);
			 	}
			}
		}
	}
		
	
	public boolean validaCarrinho(boolean vazio)
	{		
		if (carrinhoCliente.isEmpty()) {
			System.out.println("ESTA VAZIO");
			return false;
		}else {
			 for(Produto i : carrinhoCliente) {
					
					System.out.println(i.getCodigo() + i.getNomeProduto() + quantidadeProdutos);
						
				 		}
			 return true;
		}
	}
	
	public void finalizarCompra()
	
	{
		System.out.print("Compra finalizada " + super.getNomePessoa());
		
	}
	
	
	public  double ValorTotalCompra(double quantidade, String descricao)
	 // calculo de quantidade com seu respectivo preço
	{
		double valorTotalCompra = 0.0;
		 for(Produto i : carrinhoCliente) {
			 if(i.getCodigo().equals(descricao)) {
				  valorTotalCompra = (quantidade * i.getPrecoProduto());
				//System.out.println("Valor total da compra: R$ "+ valorTotalCompra);	
			 	}	
			}
		 return valorTotalCompra;
	}
	
	public void addListaCliente(Produto prod) {
		
		carrinhoCliente.add(prod);
		 
		 for(Produto i : carrinhoCliente) {
				
			System.out.println(i.getCodigo() + i.getNomeProduto() + quantidadeProdutos);
				
		 	}
	}
	
	public void zeraCarrinho() {
		
		if (carrinhoCliente.isEmpty()) {
			System.out.println("O carrinho já esta vazio");
		}else {
			carrinhoCliente.clear();
			System.out.println("O carrinho foi zerado");
		}
	}
	
}