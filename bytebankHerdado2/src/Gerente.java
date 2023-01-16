
public class Gerente extends Funcionario implements Autenticavel {
	
	AutenticaUtil autentica;
	
	public Gerente() {
		autentica = new AutenticaUtil();
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}

	public void setSenha(int senha) {
		autentica.setSenha(senha);	}
	
	public boolean autentica(int senha) {
		return autentica.autentica(senha);
	
	}
}
