
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Ruan Narici");
		g1.setCpf("000.000.000-00");
		g1.setSalario(5000.0);
		g1.setSenha(112233);
		
		System.out.println("Funcionario: "+ g1.getNome() + ", Cpf: " + g1.getCpf() + ", Salario: " + g1.getSalario() + ".");
		System.out.println(g1.autentica(112233));
		
		System.out.println(g1.getBonificacao());
	}
}
