package empresa;

public class Empregado {

	private String nome;
	private int matricula;
	private int horasTrabalhada;
	private double valorPorHora;	
	
	public Empregado(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public Empregado(String nome, int matricula, int horasTrabalhada, double valorPorHora) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horasTrabalhada = horasTrabalhada;
		this.valorPorHora = valorPorHora;
	}

	public double salario() {	
		
		return horasTrabalhada * valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhada() {
		return horasTrabalhada;
	}

	public void setHorasTrabalhada(int horasTrabalhada) {
		this.horasTrabalhada = horasTrabalhada;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

}
