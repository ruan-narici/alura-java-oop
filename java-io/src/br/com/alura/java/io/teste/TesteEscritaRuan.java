package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TesteEscritaRuan {
	
	public static int count;
	public static String addCondition = "sim";
	
	public static void main(String[] args) throws IOException {
		
		while (addCondition.contains("sim")) {
		
		FileOutputStream fos = new FileOutputStream("arquivo-" + count + ".txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o titulo?");
		String r1 = ler.nextLine();
		System.out.println("Qual o horario?");
		String r2 = ler.nextLine();
		System.out.println("Digite o texto: ");
		String r3 = ler.nextLine();
		
		
		bw.write("HORA: " + r2);
		bw.newLine();
		bw.write("TÍTULO: " + r1);
		bw.newLine();
		bw.newLine();
		bw.write("TEXTO: " + r3);
		
		bw.close();
		
		FileInputStream fis = new FileInputStream("arquivo-" + count + ".txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String escrita = br.readLine();
		
		while (escrita != null) {
			
			System.out.println(escrita);
			escrita = br.readLine();
		}
		
		br.close();
		count++;
		System.out.println("Deseja salvar mais algum arquivo?");
		addCondition = ler.next();
		}
	}

}
