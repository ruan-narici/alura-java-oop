package br.com.alura.main.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {
	
	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;
	

	public Funcionario (String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public LocalDate getDataAdmissao() {
		return this.dataAdmissao;
	}
	
	public BigDecimal getSalario() {
		return this.salario;
	}
	
	public void setAumento(BigDecimal aumento) {
		this.salario = this.salario.add(aumento).setScale(2, RoundingMode.HALF_UP);
	}

}
