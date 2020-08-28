package br.com.nektar.app.math;

import java.math.BigDecimal;

import br.com.nektar.app.printer.PrinterVisitor;

public interface Expression {
	BigDecimal evaluate();
	void accept(PrinterVisitor printer);
}
