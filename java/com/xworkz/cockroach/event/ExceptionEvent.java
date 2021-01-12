package com.xworkz.cockroach.event;

public class ExceptionEvent {

	public ExceptionEvent() {
		System.out.println("ExceptionEvent");
	}
	public void createExceptionalEvent(boolean create) throws Throwable{
		System.out.println("ivoked ExceptionEvent");
		if(create) {
			System.out.println("creating exceptional events");
			Throwable throwable=new Throwable();
			throw throwable;
		}
		else {
			System.out.println("no exceptional events");
		}
	}
}
