package Collections;

import java.util.*;

public class Colecoes {
		
	public static void main(String[] args) 
	{
		Collection<String> nomes = new ArrayList(); //CRIANDO UMA LISTA
		nomes.add("Mario");
		nomes.add("Aline");
		nomes.add("Giovana");//ADICIONAR NOME
		nomes.add("Alonso"); 
		
		for(String nome : nomes) { //CRIANDO UM FOR PARA COMPARAR NOME COM NOMES PERCORRENDO A LISTA
			System.out.println("Lista de nomes: "+nome); //LISTA NOME POR NOMES DA LISTA	
		}
		
		Collection<String> nomes2 = Arrays.asList("João","Luiz"); //CRIANDO UMA SEGUNDA LISTA
		nomes.addAll(nomes2); //ADICIONA A LISTA DE NOMES2 NO NOMES. 
		System.out.println("Lista de nomes:"+nomes); // PRINTANDO A LISTA	
		
		//------------------------------------------------------------------------------------------------------
		nomes.remove("Mario");//REMOVENDO NOME
		System.out.println("Lista de nomes:"+nomes);
		
		
		//------------------------------------------------------------------------------------------------------
		System.out.println("Contem o nome Giovana? " +nomes.contains("Giovana")); //PROCURA UM DADO ESPECIFICO E DEVOLVE UM VALOR BOOLEANO
		System.out.println("Lista de nomes:"+nomes);

		//------------------------------------------------------------------------------------------------------
		nomes.clear(); // APAGAR LISTA
		System.out.println("Lista de nomes:"+nomes);
		 
		//------------------------------------------------------------------------------------------------------
		//MOSTRA SE A LISTA ESTA VAZIA SE NAO ESTIVER MOSTRA OS NOMES DA LISTA
		if(nomes.isEmpty()) {
			System.out.println("Lista Vazia ...");
		} else {
			System.out.println("Lista de nomes:"+nomes);
		}
		
			
		
		
		
	
	}
}
