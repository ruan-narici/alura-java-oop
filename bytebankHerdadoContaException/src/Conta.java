
public abstract class Conta {
	
	protected double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int totalConta;

	
	public Conta(int numero, int agencia) {
		Conta.totalConta++;
		this.numero = numero;
		this.agencia = agencia;
		System.out.println("Criando conta numero " + this.numero + " e agencia " + this.agencia + ".");
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.getSaldo() + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(Conta destino, double valor) {
			saca(valor);
			destino.deposita(valor);
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
	
	public static int getTotalConta() {
		System.out.println("Número total de contas criadas: " + Conta.totalConta + ".");
		return Conta.totalConta;
	}
}
