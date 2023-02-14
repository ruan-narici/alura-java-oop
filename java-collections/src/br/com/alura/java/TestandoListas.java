package br.com.alura.java;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();

		lista.add("Iniciante em Programa��o.");
		lista.add("Java e orienta��o a objetos.");
		lista.add("Integra��o de aplica��es JAVA");
		lista.add("CSS");

		lista.forEach(curso -> {
			System.out.println("Curso: " + curso);
		});
		System.out.println();
		System.out.println("Ap�s remover o curso '" + lista.get(3) + "'.");
		lista.remove(3);
		lista.forEach(curso -> {
			System.out.println("Curso: " + curso);
		});

		System.out.println();
		System.out.println("Antes do m�todo sort().");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println();
		System.out.println("Ap�s o m�todo sort().");
		System.out.println(lista);
	}

}
