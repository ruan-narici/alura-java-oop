package br.com.alura.java;

public class BuscarAlunoMatriculadoMap {
	
	public static void main(String[] args) throws Exception {
		
		Curso c = new Curso("Dominando Listas, Sets e Mapas", "Paulo Vieira");
		Aluno a1 = new Aluno("Ruan Narici", 1234);
		Aluno a2 = new Aluno("Nayara Narici", 1231);
		Aluno a3 = new Aluno("Cintiha Oliveira", 2343);
		
		c.matricula(a1);
		c.matricula(a2);
		c.matricula(a3);
		
		System.out.println(c.buscaMatriculado(1231));
	}

}
