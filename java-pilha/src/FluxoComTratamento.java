
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Iniciando o fluxo...");
		try {
		metodo1();
		} catch (ArithmeticException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Erro: " + msg);
			ex.printStackTrace();
		}
		System.out.println("Finalizando o main.");
	}
	
	private static void metodo1() {
		System.out.println("Iniciando o metodo 1...");
		metodo2();
		System.out.println("Finalizando o metodo 1.");
	}
	
	private static void metodo2() {
		System.out.println("Iniciando o metodo 2...");
//		ArithmeticException exception = new ArithmeticException("Metodo 2 Error");
//		throw exception;
//		throw new ArithmeticException("Metodo 2 Error");
		throw new MinhaExcecao("MTD 2 Error");
		
	}
	
}
