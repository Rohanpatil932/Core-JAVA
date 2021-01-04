package com.xworkz.rules;

public  class LockDown implements Corona {

	
	@Override
	public String sanitization() {
System.out.println("sanitize hands always");		
return "sanitized";
	}
	@Override
	public int socialDistance() {
System.out.println("maintaining distance");		
return 6;
	}
	@Override
	public boolean weakMask() {
System.out.println("wear mask always");		
return true;
	}
}
