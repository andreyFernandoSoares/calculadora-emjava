package br.com.nektar.main.math;

import java.math.BigDecimal;

import br.com.nektar.main.exception.NektarMathExecption;
import br.com.nektar.main.print.PrintVisitor;

public class SquareRoot implements Expression {
	
	private Expression exp;

	public SquareRoot (Expression exp) {
		this.exp = exp;
	}

	@Override
	public BigDecimal evaluate() throws NektarMathExecption {
		try {
			return new BigDecimal(Math.sqrt(exp.evaluate().doubleValue()));
		} catch (Exception e) {
			throw new NektarMathExecption("Error converting variable type BigDecimal to Double");
		}
	}
	
	public Expression getExp() {
		return exp;
	}

	@Override
	public void accept(PrintVisitor printer) {
		printer.printSquareRoot(this);
	}
}
