package com.xworkz.events.custom;

public class ExceptionThrower {

	public void checked() throws CustomCheckedException {
		throw new CustomCheckedException("testing Checked exception");
	}

	public void unchecked() {
		throw new CustomUncheckedException("testing unchecked exception");
	}
}
