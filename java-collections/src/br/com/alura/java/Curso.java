package br.com.alura.java;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private String titulo;
	private String instrutor;
	private Set<Aluno> alunos = new HashSet<>();
	private List<Aula> aula = new LinkedList<>();
	
	public Curso(String titulo, String instrutor) throws Exception {
		if (!titulo.equals("") && !instrutor.equals("")) {
			this.titulo = titulo;
			this.instrutor = instrutor;
		} else {
			Exception ex = new Exception("Error! Invalid text.");
			throw ex;
		}
		
	}
	
	public List<Aula> getAula() {
		return Collections.unmodifiableList(aula);
	}
	
	public void adiciona(Aula aula) {
		this.aula.add(aula);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getInstrutor() {
		return this.instrutor;
	}
	
	public int getTempoTotal() {
		int tempo = 0;
		for (Aula aula : aula) {
			tempo += aula.getTempo();
		}
		return tempo;
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Set<Aluno> getAluno() {
		return Collections.unmodifiableSet(this.alunos);
	}
	
	@Override
	public String toString() {
		return "\nTítulo: " + this.titulo + "\nInstrutor: " + this.instrutor + "\nAula: " + this.aula;
	}

	public boolean estaMatriculado(Aluno outroAluno) {
		if (this.alunos.contains(outroAluno)) {
			return true;	
		} else {
			return false;
		}
	}

}
