
public class CriarConta {

	public static void main(String[] args) {
		Cliente ruan = new Cliente();
		Conta contaDoRuan = new Conta();
		
		Cliente cinthia = new Cliente();
		Conta contaDaCinthia = new Conta();
		
		
		contaDoRuan.setTitular(ruan);
		contaDoRuan.getTitular().setNome("Ruan Narici");
		contaDoRuan.getTitular().setCpf("000.000.000-00");
		contaDoRuan.getTitular().setProfissao("Programador");
		
		contaDaCinthia.setTitular(cinthia);
		contaDaCinthia.getTitular().setNome("Cinthia Oliveira");
		contaDaCinthia.getTitular().setCpf("000.000.000-00");
		contaDaCinthia.getTitular().setProfissao("Desenvolvedora Front-end");
		
		
		
		contaDoRuan.deposita(100);
		contaDoRuan.transfere(contaDaCinthia, 101);
		
		System.out.println("Saldo de " + contaDoRuan.getTitular().getNome() + ": R$ " + contaDoRuan.getSaldo());
		System.out.println("Saldo de " + contaDaCinthia.getTitular().getNome() + ": R$ " + contaDaCinthia.getSaldo());
	}
}
