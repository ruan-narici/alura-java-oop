
public class ImpostoDeRenda {
	
	public static void main(String[] args) {
		double salario = 3000;
		
		if (salario >= 1900 && 
				salario <= 2800) {
			System.out.println("O IR é de 7.5%.");
			System.out.println("O valor da declaração será de R$ 142,00.");
		}
		else if (salario >= 2800.01 && 
				salario <= 3751) {
			System.out.println("O IR é de 15%.");
			System.out.println("O valor da declaração será de R$ 350,00.");
		}
		else if (salario >= 3751.01 && 
				salario <= 4664) {
			System.out.println("O IR é de 22,5%.");
			System.out.println("O valor da declaração será de R$ 636,00.");
		}
		else {
			System.out.println("Não será necessário declarar o Imposto de Renda (IR).");
		}
	}
}
