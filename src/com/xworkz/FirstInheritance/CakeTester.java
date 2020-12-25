package com.xworkz.FirstInheritance;

public class CakeTester {

	public static void main(String[] args) {
		Cake cake = new Cake();

		System.out.println();
		System.out.println("cake created");
		System.out.println(cake.getFlavour());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());

		ChocoTuffleCake chocoTuffleCake = new ChocoTuffleCake();
		System.out.println("choco Tuffle Cake Created");
		System.out.println(chocoTuffleCake.getFlavour());
		System.out.println(chocoTuffleCake.getShape());
		System.out.println(chocoTuffleCake.getSize());

	}

}
