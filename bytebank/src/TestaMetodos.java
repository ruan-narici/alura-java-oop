
public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaDoRuan = new Conta();
		Conta contaDaCinthia = new Conta();
		
		contaDoRuan.deposita(1000);
		contaDaCinthia.deposita(1000);
		System.out.println("Conta do Ruan: " + contaDoRuan.saldo);
		System.out.println("Conta do Cinthia: " + contaDaCinthia.saldo);
		
		contaDoRuan.saca(100);
		System.out.println("Conta do Ruan: " + contaDoRuan.saldo);
		
		if(contaDaCinthia.transfere(100, contaDoRuan)) {
			System.out.println("Transferencia efetuada com sucesso!");
		}
		else {
			System.out.println("Falha na transferencia.");
		}
		
		System.out.println("Conta do Ruan: " + contaDoRuan.saldo);
		System.out.println("Conta do Cinthia: " + contaDaCinthia.saldo);
	}
}
