package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class TesteEscrita {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("file.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Salvando arquivo file.txt");
		bw.newLine();
		bw.write("Aqui eu pulei uma linha.");
		bw.close();
		
		FileInputStream fis = new FileInputStream("file.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String ler = br.readLine();
		
		while (ler != null) {
			System.out.println(ler);
			ler = br.readLine();
		}
	}

}
