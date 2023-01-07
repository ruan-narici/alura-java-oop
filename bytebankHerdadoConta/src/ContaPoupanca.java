
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}
	

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
}
