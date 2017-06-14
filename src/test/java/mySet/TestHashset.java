package test.java.mySet;

import org.testng.annotations.Test;

import main.java.mycollection.MySets;

public class TestHashset {
	
	@Test
	
	public void TC1(){

	MySets myhashset = new MySets();
	
	myhashset.add(20);
	myhashset.add(50);
	myhashset.add(40);
	myhashset.add(10);
	myhashset.add(50);
	myhashset.get();
	myhashset.sort();

	}
	
	
}