
public class Diretor extends Funcionario {
	private int senha;
	
	public boolean autenticacao(int senha) {
		if (this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		System.out.println("Bonificacao do Diretor.");
		return super.getSalario() + super.getBonificacao() + 200;
	}
}
