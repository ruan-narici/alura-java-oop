package br.com.bytebank.banco.teste.util;
import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
public class TesteArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(213,452);
		Conta cc2 = new ContaCorrente(613,122);
		Cliente cl1 = new Cliente();
	
		lista.add(cc1);
		lista.add(cc2);
		//Erro ocasionado pelo fato do ARrayList so armazenar classes do tipo Conta;
		//lista.add(cl1);
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		
	}
}
