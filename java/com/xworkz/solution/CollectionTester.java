package com.xworkz.solution;

import java.util.ArrayList;
import java.util.stream.Collectors;

import java.util.Collection;
import java.util.Iterator;

public class CollectionTester {

	public static void main(String[] args) {

		Collection chocolates = new ArrayList();

		String cadbury = "eclairs";
		String parle = "kissMe";
		String Amul = "Dark Chocolate";
		String Nestle = "kitkat";

		boolean added = false;
		added = chocolates.add(cadbury);
		System.out.println(added);

		added = chocolates.add(parle);
		System.out.println(added);

		added = chocolates.add(Amul);
		System.out.println(added);

		added = chocolates.add(Nestle);
		System.out.println(added);
		added = chocolates.add(Nestle);
		System.out.println(added);

		added = chocolates.add(null);
		System.out.println(added);

		added = chocolates.add(null);
		System.out.println(added);

		boolean cont = chocolates.contains(Nestle);
		System.out.println("contains::" + cont);

		boolean empty = chocolates.isEmpty();
		System.out.println("its empty?" + empty);

		chocolates.remove(null);
		chocolates.remove(Amul);
		Collection removedDuplicate = (Collection) chocolates.stream().distinct().collect(Collectors.toList());
		// chocolates.clear();

		System.out.println(removedDuplicate.size());
		System.out.println(removedDuplicate);

		Iterator iterator = chocolates.iterator();
		while (iterator.hasNext()) {
			System.out.println("item found");
			Object object = iterator.next();
			System.out.println(object);

		}

	}

}
