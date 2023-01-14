
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setName("Ruan");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setName("Cinthia");
		ev.setSalario(2000.0);
		
		Designer d = new Designer();
		d.setName("Nayara");
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}
	
}
