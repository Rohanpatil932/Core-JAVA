package com.xworkz.icu;

public class ICU {

	private boolean ventilator;
	private int price;
	private boolean tvAvailable;
	private ICUAdmissionDTO admissionDTO;

	public ICU() {

	}

	public ICU(boolean ventilator, int price, boolean tvAvailable) {
		this.ventilator = ventilator;
		this.price = price;
		this.tvAvailable = tvAvailable;
	}

	public void admissionDetails(String name, String problem, String doctorAlloted, String nurseAssigned) {
		this.admissionDTO = new ICUAdmissionDTO(name, problem, doctorAlloted, nurseAssigned);
	}

	public void updateDoctor(String newDoctorName) {
		this.admissionDTO.setDoctorName("Vidya");
	}

	public ICUAdmissionDTO getAdmissionDTO() {
		return admissionDTO;
	}

}