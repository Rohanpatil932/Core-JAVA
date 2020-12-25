package com.xworkz.VTU.exam;

public class HallTicket {
	private String ticketNo;
	private int noOfSubjects;
	private String studentName;
	public HallTicket(String ticketNo, int noOfSubjects, String studentName) {
		super();
		this.ticketNo = ticketNo;
		this.noOfSubjects = noOfSubjects;
		this.studentName = studentName;
	}
	public void displayDetails() {
		System.out.println("details Invoked");
		System.out.println(ticketNo);
		System.out.println(noOfSubjects);
		System.out.println(studentName);
	}
}
