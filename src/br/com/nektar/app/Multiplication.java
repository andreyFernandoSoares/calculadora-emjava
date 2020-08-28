package br.com.nektar.app;

import java.math.BigDecimal;

public class Multiplication implements Expression {
	
	private Expression left;
	private Expression right;

	public Multiplication (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public BigDecimal evaluate() {
		return left.evaluate().multiply(right.evaluate());
	}
}
