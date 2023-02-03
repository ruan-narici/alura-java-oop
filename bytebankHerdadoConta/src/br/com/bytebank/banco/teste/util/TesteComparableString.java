package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteComparableString {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta co : lista) {
			System.out.println(co);
		}
		System.out.println("---------------");
		
		lista.sort(new TitularDaContaComparator());
		
		for (Conta co : lista) {
			System.out.println(co);
		}
		System.out.println("---------------");
		
		Collections.sort(lista);
		
		for (Conta co : lista) {
			System.out.println(co);
		}
		
	}
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		String nomeC1 = o1.getTitular().getNome();
		String nomeC2 = o2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2);
	}	
}
