package test.java.myArray;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import main.java.mycollection.MyArray;
import main.java.mycollection.MyArrayList;

public class TestArrays {

	MyArray myarray;
	
	MyArrayList arraylist;

	@Test
	public void TC1() {
		myarray = new MyArray(5);
		myarray.setArrayid();
		myarray.getIdList();
		//boolean value=myarray.isExsist(10);
		//System.out.println(value);
		//int mycount=myarray.getCount(10);
	//	System.out.println(mycount);
		myarray.sortArray();
		myarray.getSortedArray();
	}
	@Test
	public void TC2() {
		arraylist = new MyArrayList();
		arraylist.setArrayid(10);
		arraylist.getIdList();
		boolean value=arraylist.isExsist(10);
		System.out.println(value);
		int mycount=arraylist.getCount(10);
		System.out.println(mycount);
		arraylist.sortArray();
		arraylist.getIdList();
	}


}
