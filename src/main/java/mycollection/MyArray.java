package main.java.mycollection;

import java.util.Arrays;
import java.util.Random;

public class MyArray {

	int[] idList;
	int arraySize;
	int[] sortedArray;

	public MyArray(int arraySize) {
		this.arraySize = arraySize;
		idList = new int[arraySize];
	}

	public int getNumber() {
		Random rand = new Random();
		int number = rand.nextInt(10) + 1;
		return number;
	}

	public void setArrayid() {

		for (int i = 0; i < idList.length; i++) {
			idList[i] = getNumber();
		}
	}

	public void getIdList() {
		for (int i : idList)
			System.out.println(i);
	}

	public boolean isExsist(int num) {
		for (int i = 0; i < idList.length; i++) {
			if (num == idList[i])
				return true;
		}
		return false;
	}

	public int getCount(int num) {
		int count = 0;
		for (int i = 0; i < idList.length; i++) {
			if (num == idList[i])
				count++;
		}
		return count;
	}

	public void sortArray() {

		sortedArray = new int[arraySize];
		int temp = 0;

		for (int i = 0; i < idList.length; i++) {

			for (int j = 0; j < idList.length - i-1; j++) {

				if (idList[j] > idList[j+1]) {

					temp = idList[j];

					idList[j] = idList[j+1];

					idList[j+1] = temp;

				}
			}


		}

	}

	public void getSortedArray() {
		for (int i : idList)
			System.out.println(i);
	}

}
