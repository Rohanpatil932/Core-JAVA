package com.xworkz.icu;

public class ICUAdmissionDTO {
	private String patientName;
	private String problem;
	private String doctorName;
	private String nurseAlloted;
	public ICUAdmissionDTO() {
		super();
	}
	public ICUAdmissionDTO(String patientName, String problem, String doctorName, String nurseAlloted) {
		super();
		this.patientName = patientName;
		this.problem = problem;
		this.doctorName = doctorName;
		this.nurseAlloted = nurseAlloted;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getproblem() {
		return problem;
	}
	public void setproblem(String problem) {
		this.problem = problem;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getNurseAlloted() {
		return nurseAlloted;
	}
	public void setNurseAlloted(String nurseAlloted) {
		this.nurseAlloted = nurseAlloted;
	}

}
