package com.xworkz.sports;

public class CeremonyTester {

	public static void main(String[] args) {
		Ceremony ceremony = new Ceremony("college fest");
		ceremony.distributeAwards("Kalpana", "Best Dancer");

		String[] food = { "pani-puri", "manchurian", "Ice-cream", "Salad", "Chocolate-pan" };
		ceremony.setFoods(food);
		
		//ceremony.displayFood();
		
		ceremony.displayCeremonyFoodsAndName();
		
		
	}
}