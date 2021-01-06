package com.xworkz.multiple.diamond;

public interface Security {

	default void open() {
		System.out.println("Security is open");
	}

	default int totalYears() {
		System.out.println("Total years of security");
		return 5;
	}
}
