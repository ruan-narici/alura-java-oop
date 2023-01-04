
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Ruan Narici");
		f1.setCpf("000.000.000-00");
		f1.setSalario(2500.0);
		
		System.out.println("Funcionario: "+ f1.getNome() + ", Cpf: " + f1.getCpf() + ", Salario: " + f1.getSalario() + ".");
	}
}
