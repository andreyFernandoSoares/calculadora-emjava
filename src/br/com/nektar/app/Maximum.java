package br.com.nektar.app;

import java.math.BigDecimal;

public class Maximum implements Expression {
	
	private Expression left;
	private Expression right;

	public Maximum (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public BigDecimal evaluate() {
		return left.evaluate().max(right.evaluate());
	}
}
