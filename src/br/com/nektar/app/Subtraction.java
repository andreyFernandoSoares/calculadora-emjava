package br.com.nektar.app;

import java.math.BigDecimal;

public class Subtraction implements Expression {
	
	private Expression left;
	private Expression right;

	public Subtraction (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public BigDecimal evaluate() {
		return left.evaluate().subtract(right.evaluate());
	}
}
