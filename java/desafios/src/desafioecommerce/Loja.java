package desafioecommerce;

import java.util.ArrayList;
import java.util.List;

public class Loja extends Produto
{
	public static List<Produto>  listaProduto = new ArrayList<Produto>();
	
	public Loja(){
		listaProduto.add(new Produto("FinalFantasy", "LB-001", 30.00, 10));
		listaProduto.add(new Produto("CS", "LB-002", 10.00, 10));
		listaProduto.add(new Produto("Call of duty", "LB-003", 20.00, 10));
		listaProduto.add(new Produto("Pokemon", "LB-004", 20.00, 10));
		listaProduto.add(new Produto("Castlevania", "LB-005", 50.00, 10));
		listaProduto.add(new Produto("League of Legends", "LB-006", 10.00, 10));
		listaProduto.add(new Produto("MU- Online", "LB-007", 10.00, 10));
		listaProduto.add(new Produto("GTAV", "LB-008", 30.00, 10));
		listaProduto.add(new Produto("Mortal Kombat", "LB-009", 50.00, 10));
		listaProduto.add(new Produto("Free Fire", "LB-010", 10.00, 10));

	}
	
	public double getPrecoProduto() {
		return super.getPrecoProduto();
	}
	public void setPrecoProduto(double precoProduto) {
		super.setPrecoProduto(precoProduto);
	}
	
	
	
	
	public String listarProdutos() {
		StringBuilder lista = new StringBuilder();
		lista.append("LISTA DE PRODUTOS\n\r");
		lista.append("[CODIGO]\t[PREÇO]\t[QUANTIDADE]\t[NOME]\n\r");

		for (Produto prod : this.listaProduto) {
			lista.append(prod.getCodigo() + "\t\t" + prod.getPrecoProduto() + "\t" + prod.getEstoque() + "\t\t"
					+ prod.getNomeProduto()+"\n\r");
		}
		return lista.toString();
	}
	
	public void addProduto(Produto produto) {
		listaProduto.add(produto);
	}
}
