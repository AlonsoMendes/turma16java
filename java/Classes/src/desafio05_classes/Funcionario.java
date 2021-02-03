package desafio05_classes;

public class Funcionario {
	
	public String primeiroNome;
	public String ultimoNome;
	public String setor;
	public String cargo;
	public int cadrastroEmpresa;
	
	public Funcionario(String primeiroNome,String ultimoNome , String setor, String cargo, int cadrastroEmpresa)
	{
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.setor = setor;
		this.cargo = cargo;
		this.cadrastroEmpresa = cadrastroEmpresa;
	}
	
	public String getFuncionario()
	{	
		String funcionario = "Funcionario:"+ primeiroNome+" "+ultimoNome+"| Setor: "+setor+"| Cargo: "+cargo;
		return funcionario;
	}
	
	
}
