package br.com.nektar.app.math;

import java.math.BigDecimal;

import br.com.nektar.app.printer.PrinterVisitor;

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
	
	public Expression getLeft() {
		return left;
	}
	
	public Expression getRight() {
		return right;
	}

	@Override
	public void accept(PrinterVisitor printer) {
		printer.printMinimum(this);
	}
}
