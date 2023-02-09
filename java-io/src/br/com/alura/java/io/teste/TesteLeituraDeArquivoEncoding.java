package br.com.alura.java.io.teste;

//import java.util.Scanner;
//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;

public class TesteLeituraDeArquivoEncoding {
	
	public static void main(String[] args) throws IOException  {
		
		FileInputStream fis = new FileInputStream("contas.csv");
		InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.ISO_8859_1);
		BufferedReader br = new BufferedReader(isr);
//		Scanner scan = new Scanner(new File("contas.csv"));
		
//		while (scan.hasNext()) {
//			String line = scan.next();
//			System.out.println(line);
//		}
		String line = br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
	}

}
