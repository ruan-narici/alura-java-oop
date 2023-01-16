
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSaca = valor + 1;
		return super.saca(valorSaca);
	}
	
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.1;
	}
}
