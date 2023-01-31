package br.com.bytebank.banco.teste.util;
import java.util.ArrayList;
import br.com.bytebank.banco.modelo.*;
public class TesteArrayList {
	
	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		Conta cc1 = new ContaCorrente(213,452);
		Conta cc2 = new ContaCorrente(613,122);
	
		lista.add(cc1);
		lista.add(cc2);
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		
	}
}
