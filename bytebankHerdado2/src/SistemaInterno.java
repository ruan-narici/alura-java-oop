
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void verifica(Autenticavel funcionario) {
		boolean autenticou = funcionario.autentica(this.senha);
		if (autenticou) {
			System.out.println("Acesso liberado!");
		} else {
			System.out.println("Acesso negado!");
		}
	}
}
