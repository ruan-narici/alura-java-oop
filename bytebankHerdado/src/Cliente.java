
public class Cliente implements Autenticacao {
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
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
	
}
