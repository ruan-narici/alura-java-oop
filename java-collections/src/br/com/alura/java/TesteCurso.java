package br.com.alura.java;

public class TesteCurso {

	public static void main(String[] args) {
		
		try {
			Curso curso = new Curso("Dominando Listas, Sets e Mapas", "Paulo Silveira");
			System.out.println(curso.getAula());
			curso.adiciona(new Aula("Relacionamentos com coleções", 24));
			curso.adiciona(new Aula("Mais práticas com relacionamentos", 17));
			curso.adiciona(new Aula("O poder dos sets", 19));
			System.out.println("# " + curso.getTitulo() + ".\nInstrutor: " + curso.getInstrutor());
			System.out.println(curso.getAula());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
