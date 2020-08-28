package br.com.nektar.app.math;

import java.math.BigDecimal;

import br.com.nektar.app.printer.PrintVisitor;

public interface Expression {
	BigDecimal evaluate();
	void accept(PrintVisitor printer);
}
