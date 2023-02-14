package br.com.alura.java;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();

		lista.add("Iniciante em Programação.");
		lista.add("Java e orientação a objetos.");
		lista.add("Integração de aplicações JAVA");
		lista.add("CSS");

		lista.forEach(curso -> {
			System.out.println("Curso: " + curso);
		});
		System.out.println();
		System.out.println("Após remover o curso '" + lista.get(3) + "'.");
		lista.remove(3);
		lista.forEach(curso -> {
			System.out.println("Curso: " + curso);
		});

		System.out.println();
		System.out.println("Antes do método sort().");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println();
		System.out.println("Após o método sort().");
		System.out.println(lista);
	}

}
