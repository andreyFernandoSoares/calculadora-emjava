package br.com.nektar.test;

import java.math.BigDecimal;

import br.com.nektar.app.math.Expression;
import br.com.nektar.app.math.Multiplication;
import br.com.nektar.app.math.Number;
import br.com.nektar.app.math.Subtraction;
import br.com.nektar.app.math.Sum;
import br.com.nektar.app.printer.Printer;
import br.com.nektar.app.printer.PrintVisitor;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Number numero1 = new Number(new BigDecimal(10));
		Number numero2 = new Number(new BigDecimal(50));
		Number numero3 = new Number(new BigDecimal(60));
		Number numero4 = new Number(new BigDecimal(90));
		
		Expression sum = new Sum(numero4, numero1);
		Expression subs = new Subtraction(numero3, numero2);
		
		Expression exp = new Multiplication(sum, subs);
		
		PrintVisitor printer = new Printer();
		exp.accept(printer);
		
		System.out.println(" = "+exp.evaluate());
	}
}
