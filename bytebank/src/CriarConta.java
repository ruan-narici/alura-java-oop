
public class CriarConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Novo saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
	}
}
