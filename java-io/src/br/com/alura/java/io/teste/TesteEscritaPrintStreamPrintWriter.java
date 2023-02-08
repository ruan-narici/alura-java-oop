package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;


public class TesteEscritaPrintStreamPrintWriter {
	
	public static void main(String[] args) throws IOException {
		
//		FileOutputStream fos = new FileOutputStream("file.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		
//		FileWriter fw = new FileWriter("file.txt");
//		BufferedWriter fw = new BufferedWriter(new FileWriter("file.txt"));
		
//		PrintStream ps = new PrintStream("file.txt");
		PrintWriter pw = new PrintWriter("file.txt");
		
		pw.println("Salvando arquivo usando PrintWriter");
		pw.println();
		pw.println();
		pw.println();
		pw.println("Aqui eu pulei três linhas.");
		pw.close();
		
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
