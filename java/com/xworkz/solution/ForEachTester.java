package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForEachTester {

	public static void main(String[] args) {

		Collection<String> names = new ArrayList();

		names.add("Hritik");
		names.add("Salman");
		names.add("Rajkumar");
		names.add("ayushaman");

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			if (name.equals("Salman")) {
				iterator.remove();
				System.out.println(names);
			}
		}
	}
}
