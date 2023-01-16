
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		Designer d1 = new Designer();
		EditorVideo ev1 = new EditorVideo();
		Cliente c1 = new Cliente();
		
		g1.setSenha(2222);
		c1.setSenha(222);
		
		SistemaInterno sistema = new SistemaInterno();
		
		sistema.verifica(g1);
		sistema.verifica(c1);
		
		
	}
}
