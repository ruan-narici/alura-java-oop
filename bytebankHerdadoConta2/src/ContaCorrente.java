
public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSaca = valor + 1;
		return super.saca(valorSaca);
	}
}
