package com.xworkz.ccd.coffeeday;

import javax.annotation.processing.Generated;

public class CoffeeMachine {

	public Power power;

	public CoffeeMachine(Power power) {
		
		this.power = power;
	}
	
	public boolean grind(String bean) {
		System.out.println("Initialized grind");
		if (bean!=null) {
			boolean generate=this.power.generatePower();
			if(generate) {
				System.out.println("grinding"+bean);
				return true;
			}
			else {
				System.out.println("not grinding");
				return false;
		}    
		
	} else {
		System.out.println("bean is not there");
		return false;
	}
		
	}
	
}
