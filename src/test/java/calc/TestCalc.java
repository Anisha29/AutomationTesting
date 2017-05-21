package test.java.calc;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import main.java.myinterface.Calculator;
import main.java.myinterface.LGCalc;
import main.java.myinterface.MyAbstractCalc;
import main.java.myinterface.SamsunCalc;
import main.java.myinterface.VisioCalc;

public class TestCalc {

	Calculator calc = new LGCalc();
	MyAbstractCalc clc=new VisioCalc(); 
	@Test
	public void TC1() {
		long value = calc.addition(4, 5);
		assertEquals(9, value);

	}

	@Test
	public void TC2() {
		long value = calc.subtraction(15, 10);
		assertEquals(5, value);

	}

	@Test
	public void TC3() {
		long value = calc.division(100, 10);
		assertEquals(10, value);

	}
	@Test
	public void TC4() {
		long value = clc.addition(4, 5);
		assertEquals(9, value);

	}

}
