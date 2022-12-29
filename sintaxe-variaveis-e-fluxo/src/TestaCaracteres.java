
public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
		char valor = 65;
		String palavra = "Alura cursos online de tecnologia.";
		
		System.out.println(letra);
		System.out.println(valor);
		System.out.println(palavra);
		
		letra = (char) (letra +1);
		valor = (char) (valor +1);
		palavra = palavra + 2022;
		
		System.out.println(letra);
		System.out.println(valor);
		System.out.println(palavra);
	}
}
