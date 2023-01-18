
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Iniciando o fluxo...");
		metodo1();
		System.out.println("Finalizando o main.");
	}
	
	private static void metodo1() {
		System.out.println("Iniciando o metodo 1...");
		metodo2();
		System.out.println("Finalizando o metodo 1.");
	}
	
	private static void metodo2() {
		System.out.println("Iniciando o metodo 2...");
		for (int i = 0; i < 5; i++) {
			System.out.println("Carregando arquivo " + i);
			Conta c = null;
			try {
				int calc = i / 0;
				c.getSaldo();
			} catch(ArithmeticException | NullPointerException ex) {
				String msg = ex.getMessage();
				System.out.println("Erro: " + msg);
			}
		}
		System.out.println("Finalizando o metodo 2.");
	}
	
}
