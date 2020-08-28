package br.com.nektar.app;

import java.math.BigDecimal;

public class Division implements Expression {
	
	private Expression left;
	private Expression right;

	public Division (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public BigDecimal evaluate() {
		return left.evaluate().divide(right.evaluate());
	}
}
