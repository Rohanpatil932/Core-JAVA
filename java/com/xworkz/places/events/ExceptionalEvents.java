package com.xworkz.places.events;

public class ExceptionalEvents {
	public ExceptionalEvents() {
		System.out.println("ExceptionalEvents invoked");
	}
	public void ExceptionalEvents(boolean create) throws Throwable {
		System.out.println("invoked ExceptionalEvents method");
		if(create) {
			System.out.println("ExceptionalEvents created");
			Throwable throwable= new Throwable();
			throw throwable;
		}else {
			System.out.println("ExceptionalEvents  not created");
		}
	}
	public void frame1() throws Throwable {
		System.out.println("Invoked frame 1");
		frame2();
	}
	public void frame2() throws Throwable {
		System.out.println("Invoked frame 2");
		frame3();
	}
	public void frame3() throws Throwable {
		System.out.println("Invoked frame 3");
		frame4();
	}
	public void frame4() throws Throwable {
		System.out.println("Invoked frame 4");
		frame5();
	}
	public void frame5() throws Throwable {
		System.out.println("Invoked frame 5");
		ExceptionalEvents(false);
	}


}
