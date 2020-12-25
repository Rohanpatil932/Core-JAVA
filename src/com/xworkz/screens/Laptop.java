package com.xworkz.screens;

public class Laptop extends Computer{

	private String core;

	public Laptop() {
		
	}
	public void performProgram() {
		System.out.println(this.core);
	}
	public String getCore() {
		return core;
	}
	public void setCore(String core) {
		this.core = core;
	}
	
	
	
	
}
