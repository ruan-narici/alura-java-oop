package br.com.alura.test.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.main.modelo.Funcionario;
import br.com.alura.main.service.BonusSalario;

public class BonusSalarioTest {
	
	@Test
	public void deveriaVoltarDezPorcentoDoSalario() {
		BonusSalario bonus = new BonusSalario();
		Funcionario funcionario = new Funcionario("Ruan", LocalDate.now(), new BigDecimal("1000"));
		//funcionario.setAumento(bonus.gerarBonus(funcionario));
		
		assertEquals(new BigDecimal("100.00"), bonus.gerarBonus(funcionario));
	}
	
	@Test
	public void deveriaVoltarUmaException() {
		BonusSalario bonus = new BonusSalario();
		Funcionario funcionario = new Funcionario("Ruan", LocalDate.now(), new BigDecimal("11000"));
		//funcionario.setAumento(bonus.gerarBonus(funcionario));
		
		//assertEquals(new BigDecimal("1000.00"), bonus.gerarBonus(funcionario));
		assertThrows(IllegalArgumentException.class,
				() -> {
					bonus.gerarBonus(funcionario);	
				});
	}

}
