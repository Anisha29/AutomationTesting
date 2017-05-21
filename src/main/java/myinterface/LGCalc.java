package main.java.myinterface;

public class LGCalc implements Calculator {

	@Override
	public long addition(long a, long b) {
		
		return a+b;
	}

	@Override
	public long subtraction(long a, long b) {
		long c=a-b;
		return c;
	}

	@Override
	public long Multiplication(long a, long b) {
		
		return a*b;
	}

	@Override
	public long division(long a, long b) {
		long z=a/b;
		return z;
	}

	
}
