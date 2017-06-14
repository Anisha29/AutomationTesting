package main.java.mycollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySets {

	Set<Integer> set = new LinkedHashSet<Integer>();

	public void add(int item) {

		set.add(item);
	
	}

	public void get() {

		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}
	}

	public void sort() {

		TreeSet mytreeset = new TreeSet(set);
		
		Iterator iterator = mytreeset.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}
	}
	}

