package main.java.Mynumber;

public class Digit {
	int num;
	String numType;

	public  String checknum(int number) {
		this.num=number;
		if (num > 0) {
			numType = "positive";
		} else if (num < 0) {
			numType = "negative";
		} else {
			numType = "zero";

		}

		return numType;
	}

}
