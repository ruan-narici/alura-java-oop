
public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Gerente g1 = new Gerente();
		Diretor d1 = new Diretor();
		
		f1.setSalario(1000.0);
		g1.setSalario(1000.0);
		d1.setSalario(1000.0);
		
		
		ControleBonificacao bonificacao = new ControleBonificacao();
		
		bonificacao.registra(f1);
		bonificacao.registra(g1);
		bonificacao.registra(d1);
		
		System.out.println("Total de bonificacao: " + bonificacao.getSoma());
		
//		System.out.println(" Padrao: " + f1.getBonificacao());
//		System.out.println(" Gerente: " + g1.getBonificacao());
//		System.out.println(" Diretor: " + d1.getBonificacao());

	}
}
