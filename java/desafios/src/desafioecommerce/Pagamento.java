package desafioecommerce;

	public class Pagamento extends Carrinho{

		private double valorTotal; 
		private double imposto = 0.09;

		
		public Pagamento(String nomePessoa, String genero, String nomeProduto, String codigo, double precoProduto,
				int estoque, int quantidadeProdutos, double valorTotal, double imposto) {
			super(nomePessoa, genero, nomeProduto, codigo, precoProduto, estoque, quantidadeProdutos);
			this.valorTotal = valorTotal;
			this.imposto = imposto;
		}

		public Pagamento(double valorTotal, double imposto) {
			super();
			this.valorTotal = valorTotal;
			this.imposto = imposto;
		}


		public Pagamento() {
			
		}

		
		public double PagamentoAvista(double valorTotal) {
			this.valorTotal = valorTotal; 
			double desconto =(valorTotal * 0.1);
			 valorTotal = (valorTotal - desconto);
			 return valorTotal; 
		}

		public double PagamentoCartao1(double valorTotal) {
			this.valorTotal = valorTotal;
			return valorTotal; 
		}
		
		public double PagamentoCartao2(double valorTotal) {
			this.valorTotal = valorTotal;
			double juros =(valorTotal * 0.1);
			double valorTotalComJuros = (valorTotal+juros);
			return (valorTotalComJuros/2);
		}
		
		public double PagamentoCartao3(double valorTotal) {
			this.valorTotal = valorTotal;
			double juros =(valorTotal * 0.15);
			double valorTotalComJuros = (valorTotal+juros);
			return (valorTotalComJuros/3);
		}
		
		
		public void FinalizarPagamento() {
			System.out.println("Obrigado por utilizar nossos serviços!!!");
		}
		public double getValorTotal() {
			return valorTotal;
		}


		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}


		public double getImposto() {
			return imposto;
		}


		public void setImposto(double imposto) {
			this.imposto = imposto;
		}


	}
