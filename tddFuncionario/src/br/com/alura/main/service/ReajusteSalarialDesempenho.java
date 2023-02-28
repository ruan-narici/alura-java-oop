package br.com.alura.main.service;

import java.math.BigDecimal;

import br.com.alura.main.modelo.Desempenho;
import br.com.alura.main.modelo.Funcionario;

public class ReajusteSalarialDesempenho {

	public void reajustarSalario(Funcionario funcionario, Desempenho desempenho) {
	
			BigDecimal reajuste = funcionario.getSalario().multiply(desempenho.porcentagemDesempenho());
			funcionario.setAumento(reajuste);
	}

}
