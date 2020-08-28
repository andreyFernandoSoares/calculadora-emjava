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
 * Classe responsavél por gerar a subtração.
 * Esta classe implementa a Interface Expression, clique nela para conferir como a mesma funciona
 * Compativel com Java 11
 * 
 */
public class Subtraction implements Expression {
	
	private Expression left;
	private Expression right;
	
	/**
	 * Contrutor da classe
	 * @param left
	 * @param right
	 */
	public Subtraction (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public BigDecimal evaluate() throws NektarMathExecption {
		try {
			return left.evaluate().subtract(right.evaluate());
		} catch (Exception e) {
			throw new NektarMathExecption("Error when calculating "+e.getMessage());
		}
	}
	
	/**
	 * Busca expressão da esquerda
	 * @return
	 */
	public Expression getLeft() {
		return left;
	}
	
	/**
	 * Busca expressão da direita
	 * @return
	 */
	public Expression getRight() {
		return right;
	}

	@Override
	public void accept(PrintVisitor printer) {
		printer.printSubtraction(this);
	}
}
