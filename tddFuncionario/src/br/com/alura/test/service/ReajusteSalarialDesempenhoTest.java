package br.com.alura.test.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.main.modelo.Funcionario;
import br.com.alura.main.service.ReajusteSalarialDesempenho;
import br.com.alura.main.modelo.Desempenho;

public class ReajusteSalarialDesempenhoTest {
	
	private ReajusteSalarialDesempenho reajusteDesempenho;
	private Funcionario funcionario;
	
	@BeforeEach
	public void inicializar() {
		reajusteDesempenho = new ReajusteSalarialDesempenho();
		funcionario = new Funcionario("Ruan", LocalDate.now(), new BigDecimal("1000"));
	}
	
	@Test
	public void reajusteDeveSerDeTresPorcentoSeODesempenhoForADesejar() {
		reajusteDesempenho.reajustarSalario(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveSerDeQuinzePorcentoSeODesempenhoForBom() {
		reajusteDesempenho.reajustarSalario(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveSerDeVintePorcentoSeODesempenhoForOtimo() {
		reajusteDesempenho.reajustarSalario(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
