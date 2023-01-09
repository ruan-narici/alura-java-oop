
public class SistemaDeInformacao {
	
	private int senha = 222;
	
	public void autentica(Autenticacao funcionario) {
		boolean autenticou = funcionario.autentica(this.senha);
		if (autenticou) {
			System.out.println("Acesso liberado!");
		}
		else {
			System.out.println("Acesso negado!");
		}
	}
	
}
