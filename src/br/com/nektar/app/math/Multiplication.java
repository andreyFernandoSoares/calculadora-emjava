package br.com.nektar.app.math;

import java.math.BigDecimal;

import br.com.nektar.app.printer.PrintVisitor;

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
	
	public Expression getLeft() {
		return left;
	}
	
	public Expression getRight() {
		return right;
	}

	@Override
	public void accept(PrintVisitor printer) {
		printer.printMultiplication(this);
	}
}
