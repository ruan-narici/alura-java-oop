
public class TesteConexao2 {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
			conexao.confirmaDados();
		} catch (Exception ex) {
			System.out.println("Falha na conexao");
		}
	}
}
