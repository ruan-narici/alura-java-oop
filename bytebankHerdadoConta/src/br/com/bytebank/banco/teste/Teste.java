package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 444);
		ContaPoupanca cp = new ContaPoupanca(111, 333);
		
		System.out.println(cc);
		System.out.println(cp);
	}

}
