
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setName("Ruan Narici");
		g1.setCpf("000.000.000-00");
		g1.setSalario(5000.0);
		g1.setSenha(22143);
		boolean autenticou = g1.autentica(22143);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getBonificacao());
		System.out.println(autenticou);
	}
	
}
