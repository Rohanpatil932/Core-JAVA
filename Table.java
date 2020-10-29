public class Table
{
	public static void holding(String carry)
	{
		System.out.println("holding");
		System.out.println("argument given: "+carry);
	}
	public static void holding(String anything, String something)
	{
		System.out.println("holding");
		System.out.println("argument given: "+anything);
		System.out.println("argument given: "+something);
	
	}
	public static void holding(String value, int number)
	{
		System.out.println("holding");
		System.out.println("value"+value);
		System.out.println("number"+number);
	}
	
}