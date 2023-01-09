
public class TesteSistema {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Gerente g1 = new Gerente();     
		Diretor d1 = new Diretor();
		Design de1 = new Design();
		
		c1.setSenha(222);
		g1.setSenha(333);
		d1.setSenha(444);
		de1.setSenha(555);
		
		SistemaDeInformacao si = new SistemaDeInformacao();
		
		si.autentica(c1);
		si.autentica(g1);

		
	}
}
