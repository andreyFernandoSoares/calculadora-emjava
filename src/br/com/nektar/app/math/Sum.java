package br.com.nektar.app.math;

import java.math.BigDecimal;

import br.com.nektar.app.printer.PrinterVisitor;

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
	
	public Expression getLeft() {
		return left;
	}
	
	public Expression getRight() {
		return right;
	}

	@Override
	public void accept(PrinterVisitor printer) {
		printer.printSum(this);
	}
}
