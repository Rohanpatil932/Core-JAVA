package com.xworkz.sports;

public class Ceremony {

	private String name;
	private String[] foods;
	

	public Ceremony() {
		System.out.println("Invoked Ceremony");
	}

	

	public void distributeAwards(String PersonName, String award) {
		System.out.println("name::" + PersonName);
		System.out.println("award::" + award);
	}

	public void displayFood() {
		System.out.println(this.foods);
		if (this.foods != null) {
			for (int z = 0; z < this.foods.length; z++) {
				String show = this.foods[z];
				System.out.println(show);

			}
		}
	}
	public void displayCeremonyFoodsAndName() {
		System.out.println(this.name);
		this.displayFood();
		
	}
	public Ceremony(String name) {
		this.name=name;
		
	}
	public void setFoods(String[] foods) {
		this.foods = foods;
	}


}
