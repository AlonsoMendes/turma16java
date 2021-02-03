package exemplos2;

public class TestePessoaMain {
		
	public static void main(String[] args) {
		
		Pessoa giovana = new Pessoa("Giovana", 777);
		Funcionario1 alonso = new Funcionario1("Alonso", 777, "TI");
		Pessoa mario = new Funcionario1("Mario", 555, "Informatica");
		Pessoa joao = new Coordenador("João", 999, "JAVA");
			
		System.out.println(giovana.getMatricula());
		System.out.println(alonso.getDepartamento());
		System.out.println(mario.getMatricula());
		System.out.println(joao.getNome());
		
		
	}
}
