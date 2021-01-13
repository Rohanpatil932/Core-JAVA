package com.xworkz.events.custom;

public class ExceptionTester {

	public static void main(String[] args) {
		ExceptionThrower thrower = new ExceptionThrower();
		try {
			thrower.checked();
		} catch (CustomCheckedException e) {
			System.err.println(e.getMessage()); 
		}
		try {
		thrower.unchecked();
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}

}
