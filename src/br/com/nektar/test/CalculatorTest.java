package br.com.nektar.test;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.nektar.main.exception.NektarMathExecption;
import br.com.nektar.main.math.Expression;
import br.com.nektar.main.math.Multiplication;
import br.com.nektar.main.math.Number;
import br.com.nektar.main.math.Subtraction;
import br.com.nektar.main.math.Sum;
import br.com.nektar.main.print.PrintVisitor;
import br.com.nektar.main.print.Printer;

public class CalculatorTest {
	
	@Test
	public void TestaCalculadora() throws NektarMathExecption {
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
