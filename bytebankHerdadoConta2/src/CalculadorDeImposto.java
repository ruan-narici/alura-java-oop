
public class CalculadorDeImposto {

	private double registro;
	
	public void registrarImposto(Tributavel t) {
		registro += t.getValorImposto();
	}
	
	public double getValorDoImposto() {
		return registro;
	}
}
