package main.java.myinterface;

public class SamsunCalc implements Calculator {

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
