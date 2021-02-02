package exemplos;

import entidade.Pessoa;

public class ExemploClasse {
	
	public static void main(String[] args) {
		
		Pessoa cliente1 = new Pessoa("XXXXX");
		Pessoa cliente2 = new Pessoa("XXXXX");
		
		//cliente1.nome = "Giovana Dias";
		//cliente1.estaViva = false;
		
		if(cliente1.estaViva)
		{
			System.out.println("ELA ESTA VIVA");
		} else
		{
			System.out.println("NAO SEI");
		}
	}

}
