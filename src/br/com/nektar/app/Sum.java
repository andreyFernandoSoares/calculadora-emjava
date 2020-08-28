package br.com.nektar.app;

import java.math.BigDecimal;

public class Sum implements Expression {
	
	private Expression left;
	private Expression right;

	public Sum (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public BigDecimal evaluate() {
		return left.evaluate().add(right.evaluate());
	}
}
