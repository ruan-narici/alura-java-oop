package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		Integer a = Integer.valueOf(10);
		int b = a.intValue();
		System.out.println(b);
		
		List<Number> lista = new ArrayList<>();
		lista.add(b + 1);
		try {
			System.out.println(lista.get(0));
			System.out.println(lista.get(1));
		} catch (IndexOutOfBoundsException c) {
			System.out.println("Erro: " + c.getMessage());
		}
		System.out.println("Fim!");
	}
}
