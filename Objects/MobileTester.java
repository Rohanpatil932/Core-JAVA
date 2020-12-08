package com.xworkz.Objects;

public class MobileTester {

	public static void main(String[] args) {
		Mobile.location = "B'lore";
		Mobile mobile=new Mobile();
		mobile.model="nokia";
		mobile.color="black";
		mobile.memory="128";
		mobile.yearOfUnit="2020";
		mobile.battery="5000";
		mobile.displayInfo();
		System.out.println("______***_______");
		
		Mobile mobile1=new Mobile();
		mobile1.model="IPohone";
		mobile1.color="Gold";
		mobile1.memory="64";
		mobile1.yearOfUnit="2016";
		mobile1.battery="3000";
		mobile1.displayInfo();
	}
}
 
