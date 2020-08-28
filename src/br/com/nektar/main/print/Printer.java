package br.com.nektar.main.print;

import br.com.nektar.main.math.Division;
import br.com.nektar.main.math.Exponentiation;
import br.com.nektar.main.math.Maximum;
import br.com.nektar.main.math.Minimum;
import br.com.nektar.main.math.Multiplication;
import br.com.nektar.main.math.Rest;
import br.com.nektar.main.math.SquareRoot;
import br.com.nektar.main.math.Subtraction;
import br.com.nektar.main.math.Sum;
import br.com.nektar.main.math.Number;

/**
 * 
 * @author Andrey Soares
 * @since 2020
 * @version 1.0
 * 
 * Interface responsavél por implementar o contrato de visita as classe matemáticas.
 * Os metodos desta classe são responsaveis por sobrescrever os metodos da interface PrintVisitor
 * Compativel com Java 11
 * 
 */
public class Printer implements PrintVisitor {
	
	@Override
	public void printNumber(Number number) {
		System.out.print(number.getNumber());
	}
	
	@Override
	public void printSum(Sum sum) {
		System.out.print("(");
		sum.getLeft().accept(this);
		System.out.print(" + ");
		sum.getRight().accept(this);
		System.out.print(")");
	}
	
	@Override
	public void printSubtraction(Subtraction subtraction) {
		System.out.print("(");
		subtraction.getLeft().accept(this);
		System.out.print(" - ");
		subtraction.getRight().accept(this);
		System.out.print(")");
	}
	
	@Override
	public void printMultiplication(Multiplication muliplication) {
		System.out.print("(");
		muliplication.getLeft().accept(this);
		System.out.print(" * ");
		muliplication.getRight().accept(this);
		System.out.print(")");
	}
	
	@Override
	public void printDivision(Division division) {
		System.out.print("(");
		division.getLeft().accept(this);
		System.out.print(" / ");
		division.getRight().accept(this);
		System.out.print(")");
	}
	
	@Override
	public void printMaximum(Maximum maximum) {
		System.out.print("(");
		maximum.getLeft().accept(this);
		System.out.print(" max ");
		maximum.getRight().accept(this);
		System.out.print(")");
	}
	
	@Override
	public void printRest(Rest rest) {
		System.out.print("(");
		rest.getLeft().accept(this);
		System.out.print(" % ");
		rest.getRight().accept(this);
		System.out.print(")");
	}
	
	@Override
	public void printExponentiation(Exponentiation exponentiation) {
		System.out.print("(");
		exponentiation.getLeft().accept(this);
		System.out.print(" pow ");
		exponentiation.getRight().accept(this);
		System.out.print(")");
	}
	
	@Override
	public void printMinimum(Minimum minimum) {
		System.out.print("(");
		minimum.getLeft().accept(this);
		System.out.print(" min ");
		minimum.getRight().accept(this);
		System.out.print(")");
	}
	
	@Override
	public void printSquareRoot(SquareRoot squareRoot) {
		System.out.print("( sqrt ");
		squareRoot.getExp().accept(this);
		System.out.print(")");
	}
}
