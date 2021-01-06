package com.xworkz.multiple.diamond;

public interface Contract {

	default int maxBooking() {
		System.out.println("max booking created");
		return 800;
	}

	default int minBooking() {
		System.out.println("min booking created");
		return 200;
	}
}