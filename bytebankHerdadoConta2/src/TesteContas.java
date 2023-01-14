
public class TesteContas {

	public static void main(String[] args) {
		
	ContaCorrente cc = new ContaCorrente(111, 111);
	ContaPoupanca cp = new ContaPoupanca(222, 222);
	
	cc.deposita(100.0);
	cp.deposita(200.0);
	
	cc.transfere(cp, 5.0);
	
	System.out.println("CC: " + cc.getSaldo());
	System.out.println("CP: " + cp.getSaldo());
		
	}
	
}
