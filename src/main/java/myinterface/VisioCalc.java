package main.java.myinterface;

public class VisioCalc extends MyAbstractCalc {

	@Override
	public long addition(long a, long b) {

		return a + b;
	}

	@Override
	public long subtraction(long a, long b) {

		return a - b;
	}

	@Override
	public long Multiplication(long a, long b) {

		return a * b;
	}

	@Override
	public long division(long a, long b) {

		return a / b;
	}

}
