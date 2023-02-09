package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String caracter = "Ç";
		System.out.println(caracter.codePointAt(0));
		
		Charset charsetPadrao = Charset.defaultCharset();
		System.out.println(charsetPadrao);
		
		byte[] arrayBytes = caracter.getBytes("windows-1252");
		System.out.println(arrayBytes.length + ", windows-1252");
		String newBytes = new String(arrayBytes, "windows-1252");
		System.out.println(newBytes);
		
		arrayBytes = caracter.getBytes("UTF-16");
		System.out.println(arrayBytes.length + ", UTF-16");
		newBytes = new String(arrayBytes,  "UTF-16");
		System.out.println(newBytes);
		
		arrayBytes = caracter.getBytes(StandardCharsets.US_ASCII);
		System.out.println(arrayBytes.length + ", US_ASCII");
		newBytes = new String(arrayBytes,  StandardCharsets.US_ASCII);
		System.out.println(newBytes);
		
	}

}
