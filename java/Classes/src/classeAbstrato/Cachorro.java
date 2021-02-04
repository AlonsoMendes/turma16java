package classeAbstrato;

public class Cachorro extends Animal { //implements AnimalInterface 
	
	public String raça;
	private double km;

	public Cachorro(String nome, double peso, String raça, double km) {
		super(nome, peso);
		this.raça = raça;
		this.km = km;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	String movimentacao() {
		
		return "late";
	}
	
	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	double kmHora() {	
		double km = 10 +  15;
		return km;
				
	}

}
