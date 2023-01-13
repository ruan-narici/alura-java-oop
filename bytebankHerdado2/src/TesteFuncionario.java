
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setName("Ruan Narici");
		f1.setCpf("000.000.000-00");
		f1.setSalario(2000.0);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
	}
	
}
