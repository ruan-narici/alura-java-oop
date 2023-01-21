
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public void saca(double valor) {
		double valorASacar = valor + 0.8;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
}
