package br.com.nektar.app;

import java.math.BigDecimal;

public class SquareRoot implements Expression {
	
	private Expression exp;

	public SquareRoot (Expression exp) {
		this.exp = exp;
	}

	@Override
	public BigDecimal evaluate() {
		return new BigDecimal(Math.sqrt(exp.evaluate().doubleValue()));
	}
}
