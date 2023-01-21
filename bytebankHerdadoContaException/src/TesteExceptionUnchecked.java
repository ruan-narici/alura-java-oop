
public class TesteExceptionUnchecked {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 440);
		cc.deposita(100.0);
		cc.saca(100.0);
		System.out.println(cc.getSaldo());
	}
}
