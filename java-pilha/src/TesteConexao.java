
public class TesteConexao {

	public static void main(String[] args) {
		
		Conexao con = null;
		
		try {
			con = new Conexao();
			con.leDados();
			con.confirmaDados();
		} catch(Exception ex) {
			System.out.println("Erro de conexao");
		} finally {
			con.fecha();
		}
	}
}
