package br.com.alura.main.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.main.modelo.Funcionario;

public class BonusSalario {

	public BigDecimal gerarBonus(Funcionario funcionario) {
		BigDecimal valorBonus = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		
		if (valorBonus.compareTo(new BigDecimal("1000")) > 0 ) {
			throw new IllegalArgumentException("O funcionário possui um bonus maior do que 1000.00");
		}
		return valorBonus.setScale(2, RoundingMode.HALF_UP);
	}

}
