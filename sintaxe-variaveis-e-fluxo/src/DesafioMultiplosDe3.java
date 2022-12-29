
public class DesafioMultiplosDe3 {

	public static void main(String[] args) {
		int numero = 3;

		System.out.println("Múltiplos de 3.");
		for (int multiplos = 1; multiplos <= 100; multiplos++) {
			if (multiplos % numero == 0) {
				System.out.print(multiplos + " ");
			}
		}
	}
}
