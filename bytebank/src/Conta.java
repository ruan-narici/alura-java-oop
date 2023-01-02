
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//Método para depósito
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	//Método para saque
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	//Método para transferencia
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
}