package com.xworkz.solution;

import java.util.ArrayList;

public class FoodCollection {

	public static void main(String[] args) {
		String AustralianFood = " Meat Pie";
		String BrazilianFood = "Pudim";
		String EnglishFood = "Kidney Pie";
		String ItalianFood = "Deep-Fried Olives";
		String JapaneseFood = " Ramen";
		String SwissFood = "Chocolate";
		String ThaiFood = "Tom Yum Soup";

		ArrayList<String> foodItems = new ArrayList<String>();
		foodItems.add(SwissFood);
		foodItems.add(EnglishFood);
		foodItems.add(ThaiFood);
		foodItems.add(JapaneseFood);
		foodItems.add(ItalianFood);
		foodItems.add(BrazilianFood);
		foodItems.add(AustralianFood);

		boolean find = foodItems.contains(ThaiFood);
		System.out.println(find);

		boolean find1 = foodItems.contains(ItalianFood);
		System.out.println(find1);

		System.out.println(foodItems.size());

		System.out.println(foodItems);
	}

}
