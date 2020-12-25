package com.xworkz.shoes;

public class SneakerTester {

	public static void main(String[] args) {
		Sneakers sneakers = new Sneakers();
		System.out.println("sneakers created");
		System.out.println("model::" + sneakers.getModel());
		System.out.println("color::" + sneakers.getColor());
		System.out.println("Edition::" + sneakers.getEdition());
		System.out.println("price::" + sneakers.getPrice());

		PlimsollSneakers plimsollSneakers = new PlimsollSneakers();
		System.out.println("plimsoll Sneakers created");
		System.out.println(plimsollSneakers.getColor());
		System.out.println(plimsollSneakers.getModel());
		System.out.println(plimsollSneakers.getEdition());
		System.out.println(plimsollSneakers.getPrice());

	}

}
