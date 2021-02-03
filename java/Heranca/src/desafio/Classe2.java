package desafio;

public class Classe2 extends ClasseGeral{
	
	private String bainha;
	private String bolso;
	private boolean ziper;
	
	public Classe2(String tecido,String bainha,String bolso,boolean ziper, String marca, String cor) {
		super(tecido, marca, cor);
		
		this.bainha=bainha;
		this.bolso=bolso;
		this.ziper=ziper;
	}

	public String getBainha() {
		return bainha;
	}

	public void setBainha(String bainha) {
		this.bainha = bainha;
	}

	public String getBolso() {
		return bolso;
	}

	public void setBolso(String bolso) {
		this.bolso = bolso;
	}

	public boolean isZiper() {
		return ziper;
	}

	public void setZiper(boolean ziper) {
		this.ziper = ziper;
	}

}
