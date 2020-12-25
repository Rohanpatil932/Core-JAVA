package com.xworkz.ccd.coffeeday;

public class MachineTester {
public static void main(String[] args) {
	
	CoffeeMachine coffee=new CoffeeMachine(new Power());
	
	boolean success=coffee.grind("::Bru");
	if(success) {
		System.out.println("done");
	}
	else {
		System.out.println("pending");
	}
	
}
}
