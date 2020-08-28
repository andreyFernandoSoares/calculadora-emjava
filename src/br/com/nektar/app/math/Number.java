package br.com.nektar.app.math;

import java.math.BigDecimal;

import br.com.nektar.app.printer.PrintVisitor;

public class Number implements Expression {
	
	private BigDecimal numero;

	public Number (BigDecimal numero) {
		this.numero = numero;
	}

	@Override
	public BigDecimal evaluate() {
		return numero;
	}

	public BigDecimal getNumber() {
		return numero;
	}

	@Override
	public void accept(PrintVisitor printer) {
		printer.printNumber(this);
	}
}
