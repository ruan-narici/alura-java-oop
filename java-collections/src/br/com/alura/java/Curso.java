package br.com.alura.java;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String titulo;
	private String instrutor;
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

}
