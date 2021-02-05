package desafioRoupas;

public class Camisa extends Roupa{
	private String manga;
	private String gola;
	private String estampa;
	
	public Camisa(String tecido,String manga,String gola,String estampa, String marca, String cor) {
		super(tecido, marca, cor);
		
		this.manga=manga;
		this.gola=gola;
		this.estampa=estampa;
		
	}

	public String getManga() {
		return manga;
	}

	public void setManga(String manga) {
		this.manga = manga;
	}

	public String getGola() {
		return gola;
	}

	public void setGola(String gola) {
		this.gola = gola;
	}

	public String getEstampa() {
		return estampa;
	}

	public void setEstampa(String estampa) {
		this.estampa = estampa;
	}

}
