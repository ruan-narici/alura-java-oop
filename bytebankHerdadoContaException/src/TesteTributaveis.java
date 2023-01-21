
public class TesteTributaveis {
	
	public static void main(String[] args) throws AgenciaException {
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}

}
