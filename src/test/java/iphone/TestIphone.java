package test.java.iphone;



import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.java.inheritance.Iphone6;
import main.java.inheritance.Iphone7;

public class TestIphone {

	Iphone6 iphone6;
	Iphone7 iphone7;
	public TestIphone() {
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void TC1() {
		iphone6 = new Iphone6();
		iphone6.setColour("golden");
		iphone6.setFrontCameraType("HDR");

	}
	@Test
	public void TC2()
	{
		
		String colour=iphone6.getColour();
		assertTrue(colour.equals("golden"));
	}
	@BeforeTest
	public void TC3()
	{
		iphone7=new Iphone7();
		iphone7.setMemory("65GB");
		iphone7.setApplePay("true");
	}
	@Test
	public void TC4()
	{
		String apple=iphone7.getApplePay();
		String memory =iphone7.getMemory();
		assertTrue(memory.equals("65GB"));
		assertTrue(apple.equals("true"));
	}
	
}
