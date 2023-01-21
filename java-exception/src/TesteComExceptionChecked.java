
public class TesteComExceptionChecked {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita(10.0);
		} catch (Exception ex) {
			String error = ex.getMessage();
			System.out.println("Erro " + error);
		}
	}
}
