public class Repeat{

	public static void main(String[] msg)
	{
		boolean termination=true;
	System.out.println("JVM Invoked main");
	
	for(byte start=0; termination; start++)
	{
	System.out.println("invisible");
	System.out.println("it is::"+start);
	if (start==3){
		termination=false;
	}
	
	}
	}



}