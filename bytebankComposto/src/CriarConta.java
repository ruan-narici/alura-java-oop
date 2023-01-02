
public class CriarConta {
	
	public static void main(String[] args) {
		
		Conta contaDoRuan = new Conta();
		contaDoRuan.titular = new Cliente();
		contaDoRuan.titular.nome = "Ruan Narici";
		contaDoRuan.titular.cpf ="000.000.000-00";
		contaDoRuan.titular.profissao = "Programador";
		contaDoRuan.deposita(3000);
		
		System.out.println("Conta: " + contaDoRuan.titular.nome + ".");
		System.out.println("Saldo: " + contaDoRuan.saldo + ".");
	}
}
