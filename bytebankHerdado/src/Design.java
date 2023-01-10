
public class Design extends Funcionario implements Autenticacao {
	
	private AutenticacaoUtil autenticador;
	
	public Design() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public boolean autentica(int Senha) {
		return this.autenticador.autentica(Senha);
	}

	@Override
	public void setSenha(int Senha) {
		this.autenticador.setSenha(Senha);
	}

	@Override
	public double getBonificacao() {
		System.out.println("Bonificacao do Design.");
		double bonificacao = super.getSalario() / 2;
		return bonificacao;
	}

}
