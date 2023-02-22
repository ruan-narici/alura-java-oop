package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteDefaultMethods {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		Comparator<String> comparar = new Comparacao();
		
		palavras.add("Aula online");
		palavras.add("Casa do código");
		palavras.add("Java na Aula");
		palavras.add("Caelum");
		
		palavras.forEach(palavra -> {
			System.out.println(palavra);
		});
		
		palavras.sort(comparar);
		
		System.out.println();
		palavras.forEach(palavra -> {
			System.out.println(palavra);
		});
	}
	
}

class Comparacao implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		} else if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}

}



