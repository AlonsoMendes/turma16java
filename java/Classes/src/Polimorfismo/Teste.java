package Polimorfismo;

public class Teste {
	public static void main(String[] args) {
		
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Giovana");
		fisica.setCpf(02111123L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Alonso");
		juridica.setCnpj(100010001234567L);
		
		
		Pessoa[] pessoa = new Pessoa[2];
		pessoa[0] = fisica;
		pessoa[1] = juridica;
		
		for(Pessoa pessoas:pessoa)
		{
			System.out.println(pessoas.getNome());
		}
	}

}
