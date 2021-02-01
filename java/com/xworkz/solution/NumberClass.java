package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;

public class NumberClass {

	public static void main(String[] args) {
		long number1 = 9665344007l;
		long number2 = 8308332166l;
		long number3 = 9881566550l;
		long number4 = 9096336501l;
		long number5 = 9923098282l;

		Collection<Long> numbers = new ArrayList();
		numbers.add(number1);
		numbers.add(number2);
		numbers.add(number3);
		numbers.add(number4);
		numbers.add(number5);

		for (Long mobileNo : numbers) {
			String convertedToString = mobileNo.toString();
			Character last = convertedToString.charAt(convertedToString.length() - 1);
			
			
			if(Integer.parseInt(last.toString())>3){
				System.out.println("value greater than 3::");
				System.out.println(last);

				
			}else {
				System.out.println("less than 3::");
				System.out.println(last);
			}
		}

	}

}
