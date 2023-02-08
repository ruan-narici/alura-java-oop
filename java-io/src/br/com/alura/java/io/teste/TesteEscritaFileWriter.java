package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class TesteEscritaFileWriter {
	
	public static void main(String[] args) throws IOException {
		
//		FileOutputStream fos = new FileOutputStream("file.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		
//		FileWriter fw = new FileWriter("file.txt");
		BufferedWriter fw = new BufferedWriter(new FileWriter("file.txt"));
		
		fw.write("Salvando arquivo file.txt");
		fw.newLine();
		fw.newLine();
		fw.newLine();
		fw.write("Aqui eu pulei três linhas.");
		fw.close();
		
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
