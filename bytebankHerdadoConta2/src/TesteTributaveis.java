
public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333); 
		cc.deposita(100.0);
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		SeguroDeVida seguro = new SeguroDeVida();
		
		calc.registrarImposto(cc);
		calc.registrarImposto(seguro);
		
		
		System.out.println(calc.getValorDoImposto());
	}

}
