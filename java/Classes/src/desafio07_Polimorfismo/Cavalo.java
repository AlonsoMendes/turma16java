package desafio07_Polimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	String movimentacao() {
		
		return "Deve correr";
	}
	@Override
	String som() {
		
		return "Relinchar";
	}

}

