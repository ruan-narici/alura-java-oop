
public class Conta {
	
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere(Conta destino, double valor) {
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			System.out.println("Transferência efetuada com sucesso!");
			return true;
		}
		else {
			System.out.println("Falha ao efetuar a transferência!");
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
}
