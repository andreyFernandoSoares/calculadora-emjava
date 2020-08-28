package br.com.nektar.app;

import java.math.BigDecimal;

public class Number implements Expression {
	
	private BigDecimal numero;

	public Number (BigDecimal numero) {
		this.numero = numero;
	}

	@Override
	public BigDecimal evaluate() {
		return numero;
	}
}
