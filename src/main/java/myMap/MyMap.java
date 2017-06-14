package main.java.myMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {

	LinkedHashMap<Integer, String> mymap = new LinkedHashMap<Integer, String>();

	public void add(int key, String value) {

		mymap.put(key, value);

	}

	public void get() {

		for (Map.Entry<Integer, String> entry : mymap.entrySet()) {

			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println("key: " + key + "value: " + value);
		}
	}

	public String getValueForKey(int key) {
		String value = mymap.get(key);

		return value;
	}

	public HashMap<Integer, Integer> repeatCount(int ar[]) {
		// 5,8,5,3,1,1,3,7
		// output 5-2,8-1,3-2,1-2,7-1
		HashMap<Integer, Integer> keymap = new HashMap<Integer, Integer>();
		for (int i = 0; i < ar.length; i++) {
			int key = ar[i];
			if (keymap.containsKey(key)) {
				int counter = keymap.get(key);
				counter++;
				keymap.put(key, counter);
			} else {
				keymap.put(key, 1);
			}

		}

		return keymap;
	}

	public HashMap<String, Integer> wordCount(String text) {

		HashMap<String, Integer> keyvaluemap = new HashMap<String, Integer>();

		String[] ary = text.split("\\s+");// "\\s means one space and + means
											// more then one space."

		for (int i = 0; i < ary.length; i++) {

			String key = ary[i];

			key = key.replaceAll(",", "");

			if (keyvaluemap.containsKey(key)) {
				int count = keyvaluemap.get(key);
				count++;
				keyvaluemap.put(key, count);
			} else {
				keyvaluemap.put(key, 1);
			}
		}
		return keyvaluemap;

	}
}