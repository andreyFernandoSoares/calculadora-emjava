package br.com.nektar.main.print;

import br.com.nektar.main.math.Division;
import br.com.nektar.main.math.Exponentiation;
import br.com.nektar.main.math.Maximum;
import br.com.nektar.main.math.Minimum;
import br.com.nektar.main.math.Multiplication;
import br.com.nektar.main.math.Number;
import br.com.nektar.main.math.Rest;
import br.com.nektar.main.math.SquareRoot;
import br.com.nektar.main.math.Subtraction;
import br.com.nektar.main.math.Sum;

/**
 * 
 * @author Andrey Soares
 * @since 2020
 * @version 1.0
 * 
 * Interface responsav�l por assinar o contrato de visita as classe matem�ticas.
 * Compativel com Java 11
 * 
 */
public interface PrintVisitor {
	
	/**
	 * Imprime numero
	 * @param number
	 */
	void printNumber(Number number);
	
	/**
	 * Imprime soma
	 * @param sum
	 */
	void printSum(Sum sum);
	
	/**
	 * Imprime subtra��o
	 * @param subtraction
	 */
	void printSubtraction(Subtraction subtraction);
	
	/**
	 * Imprime multiplicacao
	 * @param muliplication
	 */
	void printMultiplication(Multiplication muliplication);
	
	/**
	 * Imprime divis�o
	 * @param division
	 */
	void printDivision(Division division);
	
	/**
	 * Imprime o maximo
	 * @param maximum
	 */
	void printMaximum(Maximum maximum);
	
	/**
	 * Imprime o resto da divis�o
	 * @param rest
	 */
	void printRest(Rest rest);
	
	/**
	 * Imprime a exponencia��o
	 * @param exponentiation
	 */
	void printExponentiation(Exponentiation exponentiation);
	
	/**
	 * Imrpime o minimo
	 * @param minimum
	 */
	void printMinimum(Minimum minimum);
	
	/**
	 * Imprime a raiz quadrada
	 * @param squareRoot
	 */
	void printSquareRoot(SquareRoot squareRoot);
}