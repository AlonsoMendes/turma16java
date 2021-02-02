package desafio05_classes;

public class Desafio02_AviaoClass {
	
	public String status;
	public String tipoDeAviao;
	public String licenca;
	
	
	public Desafio02_AviaoClass(String tipoDeAviao, String licenca,String status) {
		this.status = status;
		this.tipoDeAviao = tipoDeAviao;
		this.licenca = licenca;
	}


	public String statusDoAviao() {
		String statusAviao;
		
		if(status == "1") 
		{
			statusAviao = "VOANDO";
		}else {
			statusAviao = "POUSADO";
		}
			
		return statusAviao;
	}
	
	
	public String licencaDoAviao() {
		String licencaAvi�o;
		
		if(licenca == "1")
		{
			licencaAvi�o = "PRIVADO";
		}else if(licenca == "2") {
			licencaAvi�o = "COMERCIAL";
		}else if(licenca == "3") {
			licencaAvi�o = "LINHA A�REA";
		}else {
			licencaAvi�o = "Invalida";
		}
		
		return licencaAvi�o;
	}
	
	public String categoriaDoAviao() {
		
		String categoriaDoAviao = "";
		
		if(tipoDeAviao.equals("P"))
		{
			categoriaDoAviao = "pequeno porte";
		}else if(tipoDeAviao.equals("M")) {
			categoriaDoAviao = "m�dio porte";
		}else if(tipoDeAviao.equals("G")){
			categoriaDoAviao = "grande porte";
		}else {
			categoriaDoAviao = "INVALIDA.";
		}
		
		return categoriaDoAviao;
	}
	

}
