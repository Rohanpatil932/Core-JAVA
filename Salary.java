public class Salary
{
	public static void main(String[] none)
	{
		System.out.println("JVM Invoked");
		
		String doorNo="101";
		short connvertedNo=Short.parseShort(doorNo);
		System.out.println("connverted DoorNo"+connvertedNo);
		
		String salary="25000";
		int convertedSalary=Integer.parseInt(salary);
		System.out.println("converted salary : "+convertedSalary);
		
		int addDoorNoAndSalary=connvertedNo+convertedSalary;
		System.out.println("addDoorNoAndSalary  : "+ addDoorNoAndSalary);



		System.out.println("exit");
		
		
		
	}


}