package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;



public class EmailCollection {

	public static void main(String[] args) {

		Collection<String> emails = new ArrayList<String>();

		String Email1 = "email1@gmail.com";
		String Email2 = "email2@gmail.com";
		String Email3 = "email3@gmail.com";
		String Email4 = "email4@gmail.com";
		String Email5 = "email5@gmail.com";
		String Email6 = "email6@gmail.com";
		String Email7 = "email7@gmail.com";
		String Email8 = "email8@gmail.com";
		String Email9 = "email9@gmail.com";
		String Email10 = "email10@gmail.com";
		String Email11 = "email11@gmail.com";
		String Email12 = "email12@gmail.com";
		String Email13 = "email13@gmail.com";
		String Email14 = "email14@gmail.com";
		String Email15 = "email15@gmail.com";
		String Email16 = "email16@gmail.com";
		String Email17 = "email17@gmail.com";
		String Email18 = "email18@gmail.com";
		String Email19 = "email19@gmail.com";
		String Email20 = "email20@gmail.com";

		emails.add(Email20);
		emails.add(Email19);
		emails.add(Email18);
		emails.add(Email17);
		emails.add(Email16);
		emails.add(Email15);
		emails.add(Email14);
		emails.add(Email13);
		emails.add(Email12);
		emails.add(Email11);
		emails.add(Email10);
		emails.add(Email1);
		emails.add(Email2);
		emails.add(Email3);
		emails.add(Email4);
		emails.add(Email5);
		emails.add(Email6);
		emails.add(Email7);
		emails.add(Email8);
		emails.add(Email9);
		emails.add(Email1);
		emails.add(Email20);
		
		

		Collection<String> temp= new ArrayList<String>();
		for(String obj:emails) {
			if(!temp.contains(obj)) {
				temp.add(obj);
			}
		}
		System.out.println(temp);
		System.out.println(emails.size());
		System.out.println("tempsize::"+temp.size());
	}

}
