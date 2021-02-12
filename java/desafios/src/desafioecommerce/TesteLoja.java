package desafioecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLoja {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		Loja lojaBoa = new Loja();
		Carrinho cliente = new Carrinho();
		System.out.println(lojaBoa.listarProdutos());
		char op =' ', decisao1 = ' ';
		double recebeValor = 0.0;
		
		do {
			
			System.out.println("1 -Adicionar iten(s)\r\n" + "2 - Remover iten(s)\r\n" + "3 - Limpar Carrinho \r\n"+"4 - Finalizar a Compra \r\n");
			System.out.print("Digite o numero de sua opção: ");
			int decisao = leia.nextInt();
			
			switch(decisao)
			{
            case 1:
        		do {
                	leia.nextLine();
            		System.out.println();
            		System.out.println("Qual produto deseja?");
            		String codProdutoEscolhido = leia.nextLine().toUpperCase();
         
            		for (Produto prod : Loja.listaProduto) {
            			if (prod.getCodigo().equals(codProdutoEscolhido)) {
            				System.out.println("O produto escolhido foi " + prod.getCodigo() +" "+ prod.getNomeProduto()
            						+ "\n deseja esse mesmo? [S/N]");
            				 op = leia.next().toUpperCase().charAt(0);
            				if (op == 'S') {
            					leia.nextLine();
            					System.out.println("Qual a quantidade que deseja?");
            					int quantidadeDG = leia.nextInt();
            					cliente.setQuantidadeProdutos(quantidadeDG);
            					if (cliente.getQuantidadeProdutos() <= prod.getEstoque()) {
            						cliente.addListaCliente(prod);
            						recebeValor += cliente.ValorTotalCompra(quantidadeDG, codProdutoEscolhido);
            						System.out.println("O preço do produto "+ recebeValor);
            						break;
            					}
            				}        				
            			}
            		}
            		leia.nextLine();
            		System.out.println("Deseja volta pro MenuLoja[ S - sim voltar ao menu  | N - continuar comprando]");
            		 op = leia.next().toUpperCase().charAt(0);
                	}while(op != 'S');
            	break;
            	
            case 2:
            	
            	do {
            		
            		while(cliente.validaCarrinho(true)) {
            		leia.nextLine();

    			    try {
    			      cliente.tirarEstoque();
    			    } catch (IndexOutOfBoundsException e) {
    			        System.out.printf("\nErro: posição inválida (%s).",
    			          e.getMessage());
    			    }
        			break;
            		}
            		System.out.println("Deseja volta pro MenuLoja[ S - sim voltar ao menu  | N - continuar ]");
           		 	op = leia.next().toUpperCase().charAt(0);
        				}while(op != 'S');
            	
            	// Remover();
            	break;
            case 3:
            	cliente.zeraCarrinho();
                break;
            case 4:
                break;
            default:
                System.out.println("Digite SOMENTE números entre 1 e 4");
                break;
			}
		}while(true);
		
	}
	
}
