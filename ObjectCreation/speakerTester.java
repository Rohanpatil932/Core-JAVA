package com.xworkz.ObjectTester;

public class speakerTester {
public static void main(String[] args) {
	tester();
}
public static void tester() {
	Speaker speaker=new Speaker();
	System.out.println("brand is::"+speaker.brand);
	System.out.println("color is::"+speaker.color);
	System.out.println("compatible with::"+speaker.compatability);

	System.out.println("model is::"+speaker.Model);
	System.out.println("price is::"+speaker.price);

}
}
