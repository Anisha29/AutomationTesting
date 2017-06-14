package test.java.myMap;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;

import org.testng.annotations.Test;

import main.java.myMap.MyMap;

public class TestMyMap {

	MyMap mymap = new MyMap();;

	@Test

	public void TC1() {

		mymap.add(104, "Aman");
		mymap.add(101, "Raman");
		mymap.add(102, "Chaman");
		mymap.add(103, "Gabbar");
		mymap.get();
		String myvalue = mymap.getValueForKey(104);
		assertTrue("Aman".equals(myvalue));
	}

	@Test

	public void TC2() {

		int[] inputarray = { 5, 8, 5, 4, 4, 1, 1, 2 };
		HashMap<Integer, Integer> intCount = mymap.repeatCount(inputarray);
		System.out.println(intCount);

	}
	
	@Test
	
	public void TC3(){
		//String[] strArray = new String[] {"raka", "Shaka" , "Gabbar" , "raka" ,"Shaka","doll" , "ram" };
		
		String line = "I Love Java, I Love coding";
		HashMap<String , Integer> intCounter = mymap.wordCount(line);
		System.out.println(intCounter);
	}

}
