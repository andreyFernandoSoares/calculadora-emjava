package br.com.nektar.main.exception;

/**
 * 
 * @author Andrey Soares
 * @since 2020
 * @version 1.0
 * 
 * Classe responsavél por capturar exeções.
 * Compativel com Java 11
 * 
 */
public class NektarMathExecption extends Exception {
	
	/**
	 * Parametrô controlador de serialização da classe
	 */
	private static final long serialVersionUID = 9006834597628699743L;
	
	/**
	 * Construtor que comunica com a classe mãe.
	 * @param message
	 */
	public NektarMathExecption(String message) {
		super(message);
	}
}
