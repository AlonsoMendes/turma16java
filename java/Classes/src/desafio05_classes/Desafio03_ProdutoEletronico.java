package desafio05_classes;

public class Desafio03_ProdutoEletronico {
	
	public static void main(String[] args) {
		
		Desafio03_ProdutoEletronicoClass produto = new Desafio03_ProdutoEletronicoClass("NoteBook Gamer", 3000.00);
		
		
		System.out.print("DESCRIÇÃO\t| VALOR");
		System.out.printf("\n%s\t|%.2f",produto.descricao, produto.preço);
	}

}
