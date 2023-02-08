package br.com.alura.java.io.teste;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class TesteLeituraCsv {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNext()) {
			
			
			
			String linha = scanner.nextLine();
//			System.out.println(linha);
			Scanner elementoSeparado = new Scanner(linha);
			elementoSeparado.useDelimiter(",");
			elementoSeparado.useLocale(Locale.US);
			
			String tipoConta = elementoSeparado.next();
			int agenciaConta = elementoSeparado.nextInt();
			int numeroConta = elementoSeparado.nextInt();
			String titularConta = elementoSeparado.next();
			double saldoConta = elementoSeparado.nextDouble();
			
			String itensFormatados = String.format("%s - %04d-%d : %s R$%.2f", tipoConta, agenciaConta, numeroConta, titularConta, saldoConta);
			System.out.println(itensFormatados);
		}
	}
	
}
