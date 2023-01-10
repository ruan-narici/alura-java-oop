
public class AutenticacaoUtil {
	
	private int senha;

	public boolean autentica(int Senha) {
		if (Senha == this.senha) {
			return true;
		}
		else {
			return false;
		}
	}

	public void setSenha(int Senha) {
		this.senha = Senha;
	}

}
