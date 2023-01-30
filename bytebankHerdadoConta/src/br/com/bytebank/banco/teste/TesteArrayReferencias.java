package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(222, 113);
		ContaPoupanca cc2 = new ContaPoupanca(333, 123);
		
		Conta[] contas = new Conta[5];
		
		contas[0] = cc1;
		contas[1] = cc2;
		ContaCorrente ref = (ContaCorrente) contas[0];
	
		
		System.out.println("Agencia: " + contas[0].getAgencia() + ", Numero: " + contas[0].getNumero());
		System.out.println("Agencia: " + contas[1].getAgencia() + ", Numero: " + contas[1].getNumero());
		System.out.println("Agencia: " + ref.getAgencia() + ", Numero: " + ref.getNumero());
	}
}
