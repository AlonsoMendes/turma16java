package classeAbstrato;

public class Cachorro extends Animal { //implements AnimalInterface 
	
	public String ra�a;
	private double km;

	public Cachorro(String nome, double peso, String ra�a, double km) {
		super(nome, peso);
		this.ra�a = ra�a;
		this.km = km;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
