public class AddressTester{
	public static void main(String[] show)
	{
	System.out.println("JVM invoked main");
	
	short doorNumber=Address.doorNo;
	System.out.println("doorNumber::"+doorNumber);
	
	System.out.println("StreetNo::"+Address.StreetNo);
	
	System.out.println("city name::"+Address.city);
	
	System.out.println("state name::"+Address.state);
		
		System.out.println("JVM Exit");
	}
}