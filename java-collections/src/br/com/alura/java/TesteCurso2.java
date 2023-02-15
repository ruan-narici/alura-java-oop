package br.com.alura.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {

	public static void main(String[] args) {
		
		try {
			Curso curso = new Curso("Dominando Listas, Sets e Mapas", "Paulo Silveira");
			System.out.println(curso.getAula());
			curso.adiciona(new Aula("Relacionamentos com coleções", 24));
			curso.adiciona(new Aula("Mais práticas com relacionamentos", 17));
			curso.adiciona(new Aula("O poder dos sets", 19));
			System.out.println("# " + curso.getTitulo() + ".\nInstrutor: " + curso.getInstrutor());
			System.out.println(curso.getAula());
			System.out.println();

			List<Aula> aulasImutaveis = curso.getAula();
			System.out.println(aulasImutaveis);
			List<Aula> aulas = new ArrayList<>(aulasImutaveis);
			System.out.println();
			Collections.sort(aulas);
			System.out.println(".sort()\n" + aulas);
			System.out.println(curso);
			System.out.println();
			System.out.println("Tempo total: " + curso.getTempoTotal() + " minutos.");
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
