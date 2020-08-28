package br.com.nektar.app;

import java.math.BigDecimal;

public class Exponentiation implements Expression {

	private Expression left;
	private Integer right;

	public Exponentiation (Expression left, Integer right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public BigDecimal evaluate() {
		return left.evaluate().pow(right);
	}
}
