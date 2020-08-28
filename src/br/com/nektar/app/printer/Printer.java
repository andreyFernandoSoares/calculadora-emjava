package br.com.nektar.app.printer;

import br.com.nektar.app.math.Division;
import br.com.nektar.app.math.Exponentiation;
import br.com.nektar.app.math.Maximum;
import br.com.nektar.app.math.Minimum;
import br.com.nektar.app.math.Multiplication;
import br.com.nektar.app.math.Number;
import br.com.nektar.app.math.Rest;
import br.com.nektar.app.math.SquareRoot;
import br.com.nektar.app.math.Subtraction;
import br.com.nektar.app.math.Sum;

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
