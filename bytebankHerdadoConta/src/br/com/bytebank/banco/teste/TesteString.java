package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Mario";
		String outroNome = new String("Maria");
		
		String novo1 = outroNome.replace('a', 'A');
		
		System.out.println(outroNome);
		System.out.println("Replace: " + novo1);
		
		String novo2 = outroNome.toUpperCase();
		String novo3 = outroNome.toLowerCase();
		
		System.out.println("toUpperCase: " + novo2);
		System.out.println("toLowerCase: " + novo3);
		
		char a = nome.charAt(1);
		System.out.println("charAt: " + a);
		
		System.out.println("indexOf: " + nome.indexOf("i"));
		System.out.println("length: " + nome.length());
		System.out.println("contains: " + nome.contains("ioz"));
	}
}
