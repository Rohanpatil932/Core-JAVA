package Transfer;

public class HospitalTester {
	public static void main(String[] args) {
		Hospital hosp = new Hospital("Coloubia Asia", 99887766l);
		hosp.appointment("A Bacchan", 73, "increase in sucrose concentration", 9598979496l, 12.33f);
		AppointmentDTO appointment = hosp.getAppointmentDTO();
		System.out.println(appointment.getName());
		System.out.println(appointment.getContactNo());
		System.out.println(appointment.getAge());
		System.out.println(appointment.getReason());
		System.out.println(appointment.getTime());
	}
}
