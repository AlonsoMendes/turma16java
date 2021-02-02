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
		String licencaAvião;
		
		if(licenca == "1")
		{
			licencaAvião = "PRIVADO";
		}else if(licenca == "2") {
			licencaAvião = "COMERCIAL";
		}else if(licenca == "3") {
			licencaAvião = "LINHA AÉREA";
		}else {
			licencaAvião = "Invalida";
		}
		
		return licencaAvião;
	}
	
	public String categoriaDoAviao() {
		
		String categoriaDoAviao = "";
		
		if(tipoDeAviao.equals("P"))
		{
			categoriaDoAviao = "pequeno porte";
		}else if(tipoDeAviao.equals("M")) {
			categoriaDoAviao = "médio porte";
		}else if(tipoDeAviao.equals("G")){
			categoriaDoAviao = "grande porte";
		}else {
			categoriaDoAviao = "INVALIDA.";
		}
		
		return categoriaDoAviao;
	}
	

}
