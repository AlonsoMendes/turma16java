package exemplos;

public class CarroMain {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.cor = "Preto";
		carro.modelo = "BMW";
		carro.velocidadeAtual = 0;
		carro.velocidadeMaxima = 80;
		
		carro.liga();
		carro.acelera(20);
		
		System.out.println(carro.velocidadeAtual);
		carro.pegaMarcha();
				
		
	}

}
