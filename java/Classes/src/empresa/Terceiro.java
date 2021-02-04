package empresa;

public class Terceiro extends Empregado {
	
	private double acrescimo;
 
	public Terceiro(String nome, int matricula, int horasTrabalhada, double valorPorHora, double acrescimo) {
		super(nome, matricula, horasTrabalhada, valorPorHora);
		this.acrescimo = acrescimo;
	}

	@Override
	public double salario() {
		
		return (super.salario()* acrescimo) + super.salario();
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
}
