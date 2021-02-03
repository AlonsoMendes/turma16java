package desafio;

public class Vestimenta {
	
	public static void main(String[] args) {
		
		Camisa camiseta = new Camisa("Algodăo","Manga longa","Alta","Florido","Nike","Verde");
		Calca calca= new Calca("Jeans","Classica","Grande",true,"Adidas","Azul");
		
		camiseta.vestir();
		
		calca.setBolso("pequeno");
		
		System.out.println(calca.getBolso());
	}

}
