
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario tipo) {
		this.soma += tipo.getBonificacao() ;
	}

	public double getSoma() {
		return this.soma;
	}
}
