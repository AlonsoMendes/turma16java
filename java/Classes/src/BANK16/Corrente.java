package BANK16;

public class Corrente extends Conta {
	public int qtMesTalao = 3;
	
	public Corrente(String numero, String cpf,int qtMesTalao) 
	{
		super(numero, cpf);
		this.qtMesTalao = qtMesTalao;
	}

	public int getQtMesTalao() {
		return qtMesTalao;
	}

	public void setQtMesTalao(int qtMesTalao) {
		this.qtMesTalao = qtMesTalao;
	}

	public void Talao(int qtde)
	{
		if(qtde > qtMesTalao)
		{
			System.out.println("Opção invalida");
		}
		else {
			qtMesTalao -= qtde;
		}
	}
	
	
	

}
