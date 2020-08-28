package br.com.nektar.main.exception;

/**
 * 
 * @author Andrey Soares
 * @since 2020
 * @version 1.0
 * 
 * Classe responsav�l por capturar exe��es.
 * Compativel com Java 11
 * 
 */
public class NektarMathExecption extends Exception {
	
	/**
	 * Parametr� controlador de serializa��o da classe
	 */
	private static final long serialVersionUID = 9006834597628699743L;
	
	/**
	 * Construtor que comunica com a classe m�e.
	 * @param message
	 */
	public NektarMathExecption(String message) {
		super(message);
	}
}
