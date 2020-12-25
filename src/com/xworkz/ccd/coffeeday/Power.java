package com.xworkz.ccd.coffeeday;

public class Power {

	private int voltage = 0;

	public Power() {
		System.out.println("initialize power");

	}

	public boolean generatePower() {
		this.voltage = 200;
		return true;

	}

}
