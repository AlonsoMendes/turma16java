package desafio06_herança_encapsulamento;

public class Empregado extends Pessoa {
	
	public int codigoSetor;
	public double salarioBase;
	public double imposto;
	

	public Empregado(String nome, String endereço, String telefone, int codigoSetor, double salarioBase,
			double imposto)
	{
		super(nome, endereço, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public void codigo() 
	{
		if(codigoSetor == 1) {
			System.out.println("Trabalhando");
		}else if (codigoSetor == 2) {
			System.out.println("Ferias");
		}else if (codigoSetor == 3) {
			System.out.println("Demitido");
		}else {
			System.out.println("Codigo Invalido");
		}

	}
	
	public void calcularSalario() {
		
		double valor = salarioBase - (salarioBase * imposto);
		System.out.printf("Valor do imposto: R$ %.3f",valor);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	

}
