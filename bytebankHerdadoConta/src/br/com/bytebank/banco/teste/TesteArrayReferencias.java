package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(222, 113);
		ContaCorrente cc2 = new ContaCorrente(333, 123);
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println("Agencia: " + contas[0].getAgencia() + ", Numero: " + contas[0].getNumero());
		System.out.println("Agencia: " + contas[1].getAgencia() + ", Numero: " + contas[1].getNumero());
	}
}
