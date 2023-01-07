
public class TesteContas {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(200, 1);
		ContaCorrente cc1 = new ContaCorrente(300, 2);
		ContaPoupanca cp1 = new ContaPoupanca(400, 3);
		
		c1.deposita(200.0);
		cc1.deposita(300.0);
		cp1.deposita(400.0);
		
		c1.transfere(cc1, 20);
		cc1.transfere(cp1, 20);
		cp1.transfere(c1, 20);
		
		System.out.println("Saldo c1: " + c1.getSaldo());
		System.out.println("Saldo cc1: " + cc1.getSaldo());
		System.out.println("Saldo cp1: " + cp1.getSaldo());
	}
}
