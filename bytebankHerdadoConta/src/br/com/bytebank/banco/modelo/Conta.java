package br.com.bytebank.banco.modelo;

public abstract class Conta implements Comparable<Conta> {
	
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
	
	public static int getTotalConta() {
		System.out.println("Número total de contas criadas: " + Conta.totalConta + ".");
		return Conta.totalConta;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " +  this.agencia + ", Saldo:" + this.saldo + ", Nome: " + this.titular.getNome();
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta ct = (Conta) obj;
		if (this.agencia != ct.getAgencia()) {
			return false;
		} 
		if (this.numero != ct.getNumero()) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta o) {
		return Double.compare(this.saldo, o.saldo);
	}
}
