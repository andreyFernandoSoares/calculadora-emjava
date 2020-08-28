package br.com.nektar.main.math;

import java.math.BigDecimal;

import br.com.nektar.main.print.PrintVisitor;

/**
 * 
 * @author Andrey Soares
 * @since 2020
 * @version 1.0
 * 
 * Classe responsavél por gerar o numero.
 * Esta classe implementa a Interface Expression, clique nela para conferir como a mesma funciona
 * Compativel com Java 11
 * 
 */
public class Number implements Expression {
	
	private BigDecimal numero;
	
	/**
	 * Construtor da classe
	 * @param numero
	 */
	public Number (BigDecimal numero) {
		this.numero = numero;
	}

	@Override
	public BigDecimal evaluate() {
		return numero;
	}

	/**
	 * Busca numero
	 * @return
	 */
	public BigDecimal getNumber() {
		return numero;
	}

	@Override
	public void accept(PrintVisitor printer) {
		printer.printNumber(this);
	}
}
