
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
}
