
public class Cliente implements Autenticavel {

	private String nome;
	
	AutenticaUtil autentica;
	
	public Cliente() {
		autentica = new AutenticaUtil();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSenha(int senha) {
		autentica.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return autentica.autentica(senha);
	}
}
