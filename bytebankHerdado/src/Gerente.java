
public class Gerente extends Funcionario implements Autenticacao {
	
	private int senha;

	@Override
	public boolean autentica(int Senha) {
		if (Senha == this.senha) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void setSenha(int Senha) {
		this.senha = Senha;
	}

	
	public double getBonificacao() {
		System.out.println("Bonificacao do Gerente.");
		return super.getSalario();
	}
	
}
