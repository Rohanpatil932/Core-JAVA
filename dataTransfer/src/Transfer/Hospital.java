package Transfer;

public class Hospital {
	private String name;
	private String location;
	private long contactNO;
	private int limitForPatients = 10;
	private AppointmentDTO appointmentDTO;

	public Hospital(String name, long contactNO) {
		super();
		this.name = name;
		this.contactNO = contactNO;
	}

	public void appointment(String name,int age,String reason,long contactNo, float time) {
	this.appointmentDTO=new AppointmentDTO(name,age,reason,contactNo,time);
	
	
	
	}

	public AppointmentDTO getAppointmentDTO() {
		return appointmentDTO;
	}

	public void setAppointmentDTO(AppointmentDTO appointmentDTO) {
		this.appointmentDTO = appointmentDTO;
	}
}
