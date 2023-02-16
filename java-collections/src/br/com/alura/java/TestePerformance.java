package br.com.alura.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestePerformance {

	public static void main(String[] args) {
		
		List<Integer> addNumber = new ArrayList<>();
		Set<Integer> addNumber2 = new HashSet<>();
		
		long start = System.currentTimeMillis();
		
//LIST
//		for (int i = 0; i < 50000; i++) {
//			addNumber.add(i);
//		}
//		
//		addNumber.forEach(numero -> {
//			addNumber.contains(numero);
//		});
		
//SET
		for (int i = 0; i < 50000; i++) {
			addNumber2.add(i);
		}
		
		addNumber2.forEach(numero -> {
			addNumber2.contains(numero);
		});
		
		long end = System.currentTimeMillis();
		
		long timeExecution = end - start;
		System.out.println("Tempo gasto: " + timeExecution);
	}
}
