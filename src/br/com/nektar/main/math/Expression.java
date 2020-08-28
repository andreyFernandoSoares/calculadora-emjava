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
 * Essa Interface é responsavel por ser mão de todas expressões matematicas
 * da biblioteca, a mesma valida os tipos de expressões para reduzir erros, e tambem
 * aceita um visitante de impressão para imprimir dados no console.
 * Compativel com Java 11
 * 
 */
public interface Expression {
	/**
	 * Responsavel pora avaliar qual expressão esta sendo chamada
	 * @return
	 * @throws NektarMathExecption 
	 */
	BigDecimal evaluate() throws NektarMathExecption;
	
	/**
	 * Aceita um visitante de impressão responsavel por montar a impressão de forma organizada no console
	 * @param printer
	 */
	void accept(PrintVisitor printer);
}
