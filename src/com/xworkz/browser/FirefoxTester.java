package com.xworkz.browser;

public class FirefoxTester {

	public static void main(String[] args) {
Object generic=new Firefox();
Browser browser=new Firefox();
Firefox firefox=new Firefox();

generic =new String("test");
if(generic instanceof Browser)
{
	System.out.println("its a firefox");
	Firefox firefox2=(Firefox)generic;
	System.out.println(firefox.getName());
}
else {
	System.out.println("its not a firefox");
}
	}

}
