package com.xworkz.screens;

public class ComputerTester {
public static void main(String[] args) {
	Computer computer=new Desktop();
	Desktop desk=(Desktop)computer;
	
	desk.setScreenResolution(15.6);
	System.out.println(desk.getScreenResolution());
	desk.setGeneration(7);
	System.out.println(desk.generation);
	desk.setManufacturedCountry("KOREA");
	System.out.println(desk.manufacturedCountry);
	desk.watchMovie("Conjuring", 140.00);
	desk.browseInternate("Chrome", "www.youtube.com");
	
	
	
	Computer computer2=new Laptop();
	Laptop laptop=(Laptop)computer2;
	laptop.setCore("i5");
	System.out.println(laptop.getCore());
	laptop.performProgram();
	laptop.setModelName("Ideapad");
	System.out.println(laptop.getModelName());
	laptop.watchMovie("Anabella", 190.22);
	
	Laptop laptop2=new Laptop();
	laptop2.setCore("i9");
	System.out.println(laptop2.getCore());
	
	
	//convert computer to desktop for accessing both  computer and desktop
	Desktop cast=(Desktop)computer;

	
	
	
}
}

