
public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.8;
		return super.saca(valorASacar);
	}
}
