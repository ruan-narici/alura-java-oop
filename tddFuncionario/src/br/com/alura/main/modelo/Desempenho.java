package br.com.alura.main.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	
	A_DESEJAR {
		@Override
		public BigDecimal porcentagemDesempenho() {

			return new BigDecimal("0.03");
		}
	}, 
	
	BOM {
		@Override
		public BigDecimal porcentagemDesempenho() {

			return new BigDecimal("0.15");
		}
	}, 
	
	OTIMO {
		@Override
		public BigDecimal porcentagemDesempenho() {

			return new BigDecimal("0.20");
		}
	};

	public abstract BigDecimal porcentagemDesempenho();
}
