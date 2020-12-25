package com.xworkz.screens;

public class Computer {
	int generation;
	String modelName;
	String manufacturedCountry;

	public Computer() {
		System.out.println("invoked computer");
	}

	public Computer(int generation, String modelName, String manufacturedCountry) {
		super();
		this.generation = generation;
		this.modelName = modelName;
		this.manufacturedCountry = manufacturedCountry;
	}

	public int getGeneration() {
		return generation;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getManufacturedCountry() {
		return manufacturedCountry;
	}

	public void setManufacturedCountry(String manufacturedCountry) {
		this.manufacturedCountry = manufacturedCountry;
	}

	public void watchMovie(String movieName, double screentime) {
		System.out.println("name of movie::" + movieName);
		System.out.println("screen time::" + screentime);

	}

	public void browseInternate(String browserName, String website) {
		System.out.println("browser::" + browserName);
		System.out.println("website name::" + website);

	}

}
