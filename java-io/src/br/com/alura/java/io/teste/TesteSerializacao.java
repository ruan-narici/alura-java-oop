package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		String nome = String.valueOf("Ruan Narici Mendonça");
		Cliente cliente = new Cliente();
		cliente.setNome("Ruan Narici Mendonça");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente nomeDesserializado = (Cliente) ois.readObject();
		System.out.println(nomeDesserializado.getNome());
	}

}
