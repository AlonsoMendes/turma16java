package exemplos2;

public class ParticipanteForum implements Leitor,Programador{
	String pensamento;

	@Override
	public void pensando(char[] ideias) {
		
		pensamento = new String(ideias);
	}

	@Override
	public String digitando() {

		return pensamento;
	}

	@Override
	public String lendo() {

		return "Forum";
	}
	
	private String aprendendo()
	{
		return "JAVA";
	}

}
