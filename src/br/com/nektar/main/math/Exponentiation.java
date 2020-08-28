package br.com.nektar.main.math;

import java.math.BigDecimal;

import br.com.nektar.main.exception.NektarMathExecption;
import br.com.nektar.main.print.PrintVisitor;

/**
 * 
 * @author Andrey Soares
 * @since 2020
 * @version 1.0
 * 
 * Classe responsavél por gerar a exponenciação.
 * Esta classe implementa a Interface Expression, clique nela para conferir como a mesma funciona
 * Compativel com Java 11
 * 
 */
public class Exponentiation implements Expression {

	private Expression left;
	private Expression right;

	/**
	 * Construtor da classe
	 * @param left
	 * @param right
	 */
	public Exponentiation (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public BigDecimal evaluate() throws NektarMathExecption  {
		try {
			return left.evaluate().pow(right.evaluate().intValue());
		} catch (Exception e) {
			throw new NektarMathExecption("Error converting variable type BigDecimal to Integer");
		}
	}
	
	/**
	 * Busca expressão da direita
	 * @return
	 */
	public Expression getRight() {
		return right;
	}
	
	/**
	 * Busca expressão da esquerda
	 * @return
	 */
	public Expression getLeft() {
		return left;
	}

	@Override
	public void accept(PrintVisitor printer) {
		printer.printExponentiation(this);
	}
}
