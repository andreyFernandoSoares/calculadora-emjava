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

public interface PrintVisitor {

	void printNumber(Number number);

	void printSum(Sum sum);

	void printSubtraction(Subtraction subtraction);

	void printMultiplication(Multiplication muliplication);

	void printDivision(Division division);

	void printMaximum(Maximum maximum);

	void printRest(Rest rest);

	void printExponentiation(Exponentiation exponentiation);

	void printMinimum(Minimum minimum);

	void printSquareRoot(SquareRoot squareRoot);
}