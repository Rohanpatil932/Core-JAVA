package com.xworkz.events.email;

public class EmailTester {

	public static void main(String[] args) {
		EmailValidation exception = new EmailValidation();
		try {
			exception.printEmail("rohanpatil932gmail.com");
		} catch (EmailValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
