package desafio;

public class Main1 {
	
	public void main (String[] args) {
		
		Classe1 camiseta = new Classe1("Algodão","Manga longa","Alta","Florido","Nike","Verde");
		Classe2 calca= new Classe2("Jeans","Classica","Grande",true,"Adidas","Azul");
		
		camiseta.vestir();
		
		calca.setBolso("pequeno");
		
		System.out.println(calca.getBolso());
		
	}
}

