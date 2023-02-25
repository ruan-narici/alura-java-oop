package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteDefaultMethods {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
//		Comparator<String> comparar = new Comparacao();

		palavras.add("Aula online");
		palavras.add("Casa do código");
		palavras.add("Java na Aula");
		palavras.add("Caelum");

		palavras.forEach(palavra -> {
			System.out.println(palavra);
		});

//		palavras.sort(comparar);

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println();
		palavras.forEach(palavra -> System.out.println(palavra));
		
		System.out.println();
		System.out.println("Usando method reference: ");
		palavras.sort(Comparator.comparing(String::length));
		palavras.forEach(System.out::println);

	}
}

//class Comparacao implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length()) {
//			return -1;
//		} else if (s1.length() > s2.length()) {
//			return 1;
//		}
//		return 0;
//	}
//
//}
