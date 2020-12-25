package com.xworkz.DTO;

import java.util.Arrays;

public class SweetTester {
	public static void main(String[] args) {

		SweetDTO sweet = new SweetDTO();
		sweet.setName("Barfi");
		sweet.setPrice(400);
		String[] popularStates = new String[4];
		popularStates[0] = "MAHARASHTRA";
		popularStates[1] = "KARNATAKA";
		popularStates[2] = "WEST BENGAL";
		popularStates[3] = "KERALA";
		System.out.println(sweet.getName());
		System.out.println(sweet.getPrice());
		System.out.println(Arrays.toString(popularStates));
		System.out.println(ShapeOfSweet.diamond);

		String[] States = new String[2];
		States[0] = "WEST BENGAL";
		States[1] = "MAHARASHTRA";
		SweetDTO sweet2 = new SweetDTO("KAJU KATALI", 1200, States);
		System.out.println(Arrays.toString(States));
		System.out.println(sweet2.getName());
		System.out.println(sweet2.getPrice());
		System.out.println(ColorOfSweet.yellow);
		
		String[] StatesAll = new String[3];
		StatesAll[0] = "WEST BENGAL";
		StatesAll[1] = "TALMIL NADU";
		StatesAll[2]="KARNATAKA";
		SweetDTO sweet3=new SweetDTO("Mysore pak", 400, StatesAll, ColorOfSweet.orange, ShapeOfSweet.rectangle);
		System.out.println(sweet3.getName());
		System.out.println(sweet3.price);
		System.out.println(Arrays.toString(StatesAll));
		System.out.println(sweet3.getColor());
		System.out.println(sweet3.getShape());
	}
}
