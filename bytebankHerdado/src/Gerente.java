
public class Gerente extends Funcionario implements Autenticacao {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
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
		System.out.println("Bonificacao do Gerente.");
		return super.getSalario();
	}

}
