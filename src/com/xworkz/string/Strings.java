package com.xworkz.string;

/**
 * 
 * @author Rohan Patil
 *
 */
public class Strings {
	public static void main(String[] args) {

		String name = "Rohan";
		String nickName = "Rohan";
		String friendCallsMe = "rohan";
		String caps = "PATIL";

		if (name == nickName || name == friendCallsMe) {
			System.out.println("its equal");
		} else {
			System.out.println("not equal");
		}
		boolean equals = nickName.equals(friendCallsMe);
		System.out.println(equals);
		
		System.out.println(name.equals(nickName));
		
		System.out.println(friendCallsMe.toUpperCase());
		
		System.out.println(caps.toLowerCase());
		
		System.out.println(caps.length());
		
		System.out.println(name.concat(caps));
		
		System.out.println(name.isEmpty());
		
		System.out.println(friendCallsMe.charAt(3));
		
		System.out.println(name.toCharArray());
	}

}
