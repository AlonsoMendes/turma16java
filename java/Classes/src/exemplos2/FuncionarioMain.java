package exemplos2;

public class FuncionarioMain {
	
	public static void main(String[] args) {
		
		Funcionario func= new Funcionario();
		func.setNome("Alonso");
		func.setSalario(6500);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
		
	}

}
