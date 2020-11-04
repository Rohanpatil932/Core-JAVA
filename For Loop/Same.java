public class  Same{
	public static void main (String[] instead){
	
	System.out.println("JVM invoked main");
	System.out.println("calling loop from main method");
	for(int loop=0; loop<instead.length; loop++)
	{
		System.out.println("no."+loop);
		String Main=instead[loop];
		System.out.println("printing args"+Main);
		
	}
	
	}




}