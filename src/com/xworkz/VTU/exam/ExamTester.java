package com.xworkz.VTU.exam;

import com.xworkz.VTU.exam.Exam;

public class ExamTester {

	public static void main(String[] args) {
		Exam exam = new Exam();
		System.out.println(exam.getUnversityName());
		exam.setCode("4bb14me029");
		exam.setFees(2000);
		HallTicket hallTicket = new HallTicket("4bb14me029", 3, "Rohan");
		
		boolean Allowed=exam.Allow(hallTicket);
		if (Allowed) {
			System.out.println("can write exam");
		}
		else {
			System.out.println("not allowed");
		}
	}

}
