package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.8;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}
	
}
