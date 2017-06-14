package main.java.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyArrayList {

	List<Integer> idList = new LinkedList<Integer>();

	public int getNumber() {
		Random rand = new Random();
		int number = rand.nextInt(10) + 1;
		return number;
	}

	public void setArrayid(int length) {

		for (int i = 0; i < length; i++) {
			idList.add(getNumber());
		}
	}

	public void getIdList() {
		for (int i : idList)
			System.out.println(i);
	}

	public boolean isExsist(int num) {

		if (idList.contains(num))
			return true;
		return false;
	}

	public int getCount(int num) {
		int count = 0;
		for (int i = 0; i < idList.size(); i++) {
			if (num == idList.get(i))
				count++;
		}
		return count;
	}

	public void sortArray() {
		Collections.sort(idList);

	}
}
