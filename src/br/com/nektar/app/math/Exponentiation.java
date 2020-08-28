package br.com.nektar.app.math;

import java.math.BigDecimal;

import br.com.nektar.app.printer.PrinterVisitor;

public class Exponentiation implements Expression {

	private Expression left;
	private Expression right;

	public Exponentiation (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public BigDecimal evaluate() {
		return left.evaluate().pow(right.evaluate().intValue());
	}
	
	public Expression getRight() {
		return right;
	}
	
	public Expression getLeft() {
		return left;
	}

	@Override
	public void accept(PrinterVisitor printer) {
		printer.printExponentiation(this);
	}
}
