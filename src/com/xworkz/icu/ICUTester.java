package com.xworkz.icu;

public class ICUTester {
	public static void main(String[] args) {
        ICU icu = new ICU(true,2000,true);

		icu.admissionDetails("Magdum","Skin problem","Dr.Kulkarni","pooja");		
		ICUAdmissionDTO admissionDTO=icu.getAdmissionDTO();
		System.out.println(admissionDTO.getPatientName());
		System.out.println(admissionDTO.getDoctorName());
		System.out.println(admissionDTO.getproblem());
		System.out.println(admissionDTO.getNurseAlloted());
		icu.updateDoctor("Dr.Rahul");
		System.out.println(admissionDTO.getDoctorName());

	}

}
