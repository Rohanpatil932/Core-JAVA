package com.xworkz.ObjectCreation;

public class cameraTester {

	public static void main(String[] args) {
		System.out.println("focus type::"+Camera.focus);
		System.out.println("lens size"+Camera.lensSize);
		Camera camera=new Camera();
		System.out.println("brand is::"+camera.brand);
		System.out.println("color is::"+camera.color);
		System.out.println("prise is::"+camera.prise);
		
		System.out.println("<<<<<<<......>>>>>>>");
		Camera camera1=new Camera();
		camera1.color="white";
		System.out.println("new color is::"+camera1.color);
		System.out.println(camera1.prise=32000);
		System.out.println(camera1.brand="kodak");

	}

}
