package desafioecommerce;

	import java.util.ArrayList;
	import java.util.HashMap;

	public class Extrato {
		
	       private double debito;
		   
		   
		   
		   public Extrato() {
			}	   
		
		public Extrato(double debito) {
			super();
			this.debito = debito;
		}



		public double getQuantidade() {
			return debito;
		}



		public void setQuantidade(double debito) {
			this.debito = debito;
		}


		public void ImprimeNomeDaLoja() {
			
			System.out.println("Loja Boa");
			linha(40);
		}
		

		
		/*public void CabeÃ§alhoLoja() {
			
			linha(40);
			System.out.println("[PRODUTO]"+"\t"+"[QTDE]"+"\t"+"[VALOR FINAL]");
			linha(40);
			System.out.println();
			
		}	*/
		public static void linha(int tamanho) {
			for (int x = 1; x < tamanho; x++) {
				System.out.print("â•�");
			}
			System.out.println();
		}
		

	}


