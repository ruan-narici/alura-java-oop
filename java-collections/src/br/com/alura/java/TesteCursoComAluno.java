package br.com.alura.java;

public class TesteCursoComAluno {
	
	public static void main(String[] args) throws Exception {
		
		Curso c = new Curso("Dominando Listas, Sets e Mapas", "Paulo Vieira");
		Aluno a1 = new Aluno("Ruan Narici", 1234);
		
		c.matricula(a1);
		System.out.println(c.getAluno());
		
	}

}
