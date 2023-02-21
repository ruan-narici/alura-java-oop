package br.com.alura.java;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap2 {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        nomesParaIdade.keySet().forEach(nome -> {
        	System.out.println("Nome: " + nome);
        });
        
        nomesParaIdade.values().forEach(idade -> {
        	System.out.println("Idade: " + idade);
        });
    }
}
