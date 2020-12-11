package Transfer;

public class AppointmentDTO {
	private String Name;
	private int age;
	private String reason;
	private long contactNo;
	private float time;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public AppointmentDTO(String name, int age, String reason, long contactNo, float time) {
		super();
		Name = name;
		this.age = age;
		this.reason = reason;
		this.contactNo = contactNo;
		this.time = time;
	}
	
	
	
	

}
