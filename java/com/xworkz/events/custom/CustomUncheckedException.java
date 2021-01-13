package com.xworkz.events.custom;

public class CustomUncheckedException extends RuntimeException {

	public CustomUncheckedException() {
		super();
	}

	public CustomUncheckedException(String message) {
		super(message);
	}
}
