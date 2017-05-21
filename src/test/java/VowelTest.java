package test.java;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import main.java.Mynumber.*;
public class VowelTest {

	@Test
	
	public void TC1()
	{
		Vowel obj=new Vowel();
		int value=obj.count_Vowels("Are");
		System.out.println(value);
		assertEquals(1, value);
	}
	
}
