package br.com.alura.main.service;

import java.math.BigDecimal;

import br.com.alura.main.modelo.Desempenho;
import br.com.alura.main.modelo.Funcionario;

public class ReajusteSalarialDesempenho {

	public void reajustarSalario(Funcionario funcionario, Desempenho desempenho) {
	
		if (desempenho == Desempenho.A_DESEJAR) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
			funcionario.setAumento(reajuste);
		}  else if (desempenho == Desempenho.BOM) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
			funcionario.setAumento(reajuste);
		} else if (desempenho == Desempenho.OTIMO) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
			funcionario.setAumento(reajuste);
		}
		
	}

}
