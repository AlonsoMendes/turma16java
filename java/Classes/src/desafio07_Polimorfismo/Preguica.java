package desafio07_Polimorfismo;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	String movimentacao() {
		
		return "Deve correr";
	}
	@Override
	String som() {
		
		return "Ronca";
	}

}

