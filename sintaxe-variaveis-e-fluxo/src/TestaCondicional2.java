
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais 2...");
		
		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas > 1;
		
		if (idade >= 18 || 
			acompanhado) {
			System.out.println("Acesso liberado!");
			System.out.println("Seja bem-vindo!");
		}
		else {
			System.out.println("Acesso negado!");
			System.out.println("Você não cumpri com os requisitos para o acesso.");
		}
	}
}
