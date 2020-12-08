package com.xworkz.Objects;

public class objectTester {
public static void main(String[] args) {
	
	Vehicle.wheels="Two";
	Vehicle vehicle=new Vehicle();
	vehicle.company="Hero";
	vehicle.insurence="5 years";
	vehicle.model="Splender";
	vehicle.RTOpassing="Maharashtra";
	vehicle.displayInfo();
	System.out.println(".................");
	
	Vehicle vehicle1=new Vehicle();
	vehicle1.company="Honda";
	vehicle1.insurence="3 years";
	vehicle1.model="Shine";
	vehicle1.RTOpassing="Karnataka";
	vehicle1.displayInfo();
}
}
