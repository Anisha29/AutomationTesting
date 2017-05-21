package test.java;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import main.java.Mynumber.*;

public class NumTest {

	@Test
	public  void TC1() {
		Digit test = new Digit();
		String value = test.checknum(0);
		
		boolean result=value.equals("zero");
		System.out.println(result);
		assertTrue(result); 
	}

}
