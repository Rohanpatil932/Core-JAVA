package com.xworkz.VTU.exam;

public class SupplementaryExam extends Exam {
	public static String universityName = "VTU MANGALORE";

	public SupplementaryExam() {

		System.out.println("invoked SupplementaryExam const");
	}

	public SupplementaryExam(String name) {
		System.out.println("calling over loaded const suppl");
	}

	public boolean Allow(HallTicket hallTicket) {
		System.out.println("invoked allow from SupplementaryExam");
		return super.Allow(hallTicket);
	}

	public static String getUniversityName() {
		return universityName;
	}
}
