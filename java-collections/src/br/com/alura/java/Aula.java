package br.com.alura.java;

public class Aula implements Comparable<Aula> {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) throws Exception {
		if (titulo.equals("") || tempo == 0) {
			Exception error = new Exception("Error! You do not enter a valid value.");
			throw error;
		} else {
			this.titulo = titulo;
			this.tempo = tempo;
		}
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getTempo() {
		return this.tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", Tempo: " + this.tempo + " minutos.]";
	}

	@Override
	public int compareTo(Aula element) {
		return this.titulo.compareTo(element.getTitulo());
	}

}
