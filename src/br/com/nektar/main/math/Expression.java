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
 * Essa Interface � responsavel por ser m�o de todas express�es matematicas
 * da biblioteca, a mesma valida os tipos de express�es para reduzir erros, e tambem
 * aceita um visitante de impress�o para imprimir dados no console.
 * Compativel com Java 11
 * 
 */
public interface Expression {
	/**
	 * Responsavel pora avaliar qual express�o esta sendo chamada
	 * @return
	 * @throws NektarMathExecption 
	 */
	BigDecimal evaluate() throws NektarMathExecption;
	
	/**
	 * Aceita um visitante de impress�o responsavel por montar a impress�o de forma organizada no console
	 * @param printer
	 */
	void accept(PrintVisitor printer);
}
