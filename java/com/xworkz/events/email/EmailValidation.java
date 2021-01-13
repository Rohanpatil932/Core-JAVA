package com.xworkz.events.email;

public class EmailValidation {

	public void printEmail(String email) throws EmailValidationException  {
		if (email != null) {
			if (email.contains("@") && (email.contains(".com") || email.contains(".in"))) {
				System.out.println("valid Email");
				System.out.println(email);
			}
			else {
				throw new EmailValidationException("enter valid email");
			}
		} 
	}
}
