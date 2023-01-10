
public class Diretor extends Funcionario implements Autenticacao {
	
	private AutenticacaoUtil autenticador;
	
	public Diretor() {
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

		public double getBonificacao() {
		System.out.println("Bonificacao do Diretor.");
		return super.getSalario() + 200;
	}
}
