
public class Design extends Funcionario implements Autenticacao {
	
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

	@Override
	public double getBonificacao() {
		System.out.println("Bonificacao do Design.");
		double bonificacao = super.getSalario() / 2;
		return bonificacao;
	}

}
