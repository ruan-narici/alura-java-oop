
public class TesteExceptionChecked {

	public static void main(String[] args) {
		
		try {
			ContaPoupanca cp2 = new ContaPoupanca(2, 1);
			ContaPoupanca cp1 = new ContaPoupanca(1, 0);
		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
	}
}
