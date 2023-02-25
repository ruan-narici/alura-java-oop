package java8;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String nome;
	private int alunos;
	
	public Curso (String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getAlunos() {
		return this.alunos;
	}

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Java 8", 117));
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("C", 55));

		System.out.println("#Somente o forEach");
		cursos.forEach(c -> System.out.println("Curso: " + c.getNome() + System.lineSeparator() + "Alunos: " + c.getAlunos() + System.lineSeparator() + "-----"));
		System.out.println();
		System.out.println("#Utilizando o stream");
		System.out.println("Cursos com mais de 100 Alunos");
		cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.forEach(c -> System.out.println("Curso: " + c.getNome() + System.lineSeparator() + "Alunos: " + c.getAlunos()));
		
		System.out.println();
		System.out.println("Agora vamos fazer a soma usando o método map do stream()");
		int somaDosAlunos = cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.mapToInt(Curso::getAlunos)
		.sum();
		System.out.println(somaDosAlunos);
	}
	
}
