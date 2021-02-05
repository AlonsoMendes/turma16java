package Collections;

import java.util.*;

public class ListaAluno 
{
	public static void main(String[] args) {
		
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("ALONSO MENDES", "JAVA", 10);
		Aluno b = new Aluno("GIOVANA DIAS", "PYTHON", 9.9);
		Aluno c = new Aluno("LUIZ CLAUDIO", "JSO", 9.8);
		Aluno d = new Aluno("JOSE NASCIMENTO", "LINUX", 8.9);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		//conjunto.remove(a);
		
		System.out.println(conjunto);
		
		boolean aluno = conjunto.containsAll(conjunto);
		
		for(Aluno e: conjunto)
		{
			System.out.println("OS alunos são "+e);
		}
		
	}

}
