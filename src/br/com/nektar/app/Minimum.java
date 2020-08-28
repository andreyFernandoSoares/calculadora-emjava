package br.com.nektar.app;

import java.math.BigDecimal;

public class Minimum implements Expression {
	
	private Expression left;
	private Expression right;

	public Minimum (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public BigDecimal evaluate() {
		return left.evaluate().min(right.evaluate());
	}
}
