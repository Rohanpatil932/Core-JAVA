package com.xworkz.VTU.exam;

public class Exam {
private String code;
private double fees;
private HallTicket hallTicket;
private String UnversityName="VTU";


public Exam() {
	super();
}
public Exam(String code, double fees) {
	super();
	this.code = code;
	this.fees = fees;
}
public boolean Allow(HallTicket hallTicket) {
	boolean there=false;
	if(this.fees>=1000) {
		System.out.println("fees paid");
		if(hallTicket!=null) {
			there=true;
			this.hallTicket=hallTicket;
			this.hallTicket.displayDetails();
			System.out.println("code is:"+this.code);
		}
		else {
			System.out.println("No hall Ticket");
		}
	}
	else {
		System.out.println("fees paid is less");
	}
	return there;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
public HallTicket getHallTicket() {
	return hallTicket;
}
public void setHallTicket(HallTicket hallTicket) {
	this.hallTicket = hallTicket;
}
public String getUnversityName() {
	return UnversityName;
}
public void setUnversityName(String unversityName) {
	UnversityName = unversityName;
}



}
