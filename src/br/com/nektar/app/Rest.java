package br.com.nektar.app;

import java.math.BigDecimal;

public class Rest implements Expression {
	
	private Expression left;
	private Expression right;

	public Rest (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public BigDecimal evaluate() {
		return left.evaluate().remainder(right.evaluate());
	}
}
