package desafio05_classes;

public class Desafio01_ClienteClass {
		
	public String nome = "Alonso";
	public String pedido = "Vinho";
	public String formaPagamento = "dinheiro";
	public int idade = 18;
	
	public String Idade() {
		String idadeClient;
		
		if(idade < 18)
		{
			idadeClient = "Cliente nao pode consumir bebida alcoolica.";
		}else {
			idadeClient = "Cliente maior de idade.";
		}
		
		return idadeClient;
	}
	
}
