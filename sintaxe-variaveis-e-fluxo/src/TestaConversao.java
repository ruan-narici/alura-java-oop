
public class TestaConversao {
	public static void main (String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		
		System.out.println("Double: " + salario + ".");
		System.out.println("Int: " + valor + ".");
		
		double soma1 = 0.1;
		double soma2 = 0.2;
		double soma = soma1 + soma2;
		
		System.out.println("Soma entre doubles: " + soma1 + " e " + soma2 + " = " + soma + ".");
		
		float floatSoma1 = 0.1f;
		float floatSoma2 = 0.2f;
		float floatsoma = floatSoma1 + floatSoma2;
		
		System.out.println("Soma entre floats: " + floatSoma1 + " e " + floatSoma2 + " = " + floatsoma + ".");
	}
}
