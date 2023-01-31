package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorDeContas {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(222,331);
		Conta cc2 = new ContaCorrente(121,421);
		
		guardador.adiciona(cc);
		guardador.adiciona(cc2);
		
		Conta ref = guardador.getElemento(0);
		
		System.out.println(guardador.getQuantidadeDeElementos());
		System.out.println(ref.getAgencia());
	}

}
