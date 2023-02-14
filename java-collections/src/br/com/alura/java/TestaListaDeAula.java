package br.com.alura.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		try {
			Aula a1 = new Aula("Revistando as ArrayLists", 21);
			Aula a2 = new Aula("Listas de objetos", 20);
			Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
			
			ArrayList<Aula> aulas = new ArrayList<>();
			aulas.add(a1);
			aulas.add(a2);
			aulas.add(a3);
			
			System.out.println("#With forEach(); ");
			aulas.forEach(aula -> {System.out.println("Aula: " + aula.getTitulo() + ", Tempo: " + aula.getTempo() + " minutos."); });
			System.out.println();
			
			System.out.println("#With toString();");
			System.out.println(aulas);
			System.out.println();
			
			Collections.sort(aulas);
			System.out.println("#With compareTo(); and sort(); by title.");
			System.out.println(aulas);
			System.out.println();
			
			aulas.sort(Comparator.comparing(Aula::getTempo));
			System.out.println("#With comparing(); by time.");
			System.out.println(aulas);
			System.out.println();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
