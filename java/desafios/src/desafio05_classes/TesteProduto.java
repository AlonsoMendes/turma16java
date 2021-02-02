package desafio05_classes;

public class TesteProduto {

	public static void main(String[] args) {
		
		TesteProdutoClass produto1 = new TesteProdutoClass(777);
		TesteProdutoClass produto2 = new TesteProdutoClass(777, "Camisa");
		TesteProdutoClass produto3 = new TesteProdutoClass(777, "Camisa", 10.50);
		
		
		System.out.print("CODIGO\t| DESCRIÇÃO\t| VALOR");
		System.out.printf("\n%d\t|\t\t|",produto1.codigo);
		System.out.printf("\n%d\t|%s\t\t|",produto2.codigo,produto2.descricao);
		System.out.printf("\n%d\t|%s\t\t| %.2f",produto3.codigo,produto3.descricao,produto3.valorUnitario);
		
		
		
	}
}
