package Collections;

import java.util.*;

public class MapaAluno {
	
	public static void main(String[] args) {
		
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		
		Aluno a = new Aluno("ALONSO MENDES", "JAVA", 10);
		Aluno b = new Aluno("GIOVANA DIAS", "PYTHON", 9.9);
		Aluno c = new Aluno("LUIZ CLAUDIO", "JSO", 9.8);
		Aluno d = new Aluno("JOSE NASCIMENTO", "LINUX", 8.9);


		mapa.put("ALONSO MENDES", a);
		mapa.put("GIOVANA DIAS", b);
		mapa.put("LUIZ CLAUDIO", c);
		mapa.put("JOSE NASCIMENTO", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("GIOVANA DIAS"));
		
		Collection<Aluno> alunos = mapa.values();
		
		for(Aluno e : alunos)
		{
			System.out.println(e);
		}
	
	}

}
