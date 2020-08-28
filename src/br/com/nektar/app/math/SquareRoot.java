package br.com.nektar.app.math;

import java.math.BigDecimal;

import br.com.nektar.app.printer.PrintVisitor;

public class SquareRoot implements Expression {
	
	private Expression exp;

	public SquareRoot (Expression exp) {
		this.exp = exp;
	}

	@Override
	public BigDecimal evaluate() {
		return new BigDecimal(Math.sqrt(exp.evaluate().doubleValue()));
	}
	
	public Expression getExp() {
		return exp;
	}

	@Override
	public void accept(PrintVisitor printer) {
		printer.printSquareRoot(this);
	}
}
