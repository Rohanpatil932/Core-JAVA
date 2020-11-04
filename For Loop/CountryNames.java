public class  CountryNames{
	public static void main (String[] names){
	
	System.out.println("JVM invoked main");
	System.out.println("Country names are");
	for(int loop=0; loop<names.length; loop++)
	{
		System.out.println("countries::"+loop);
		String Main=names[loop];
		System.out.println("famous::"+Main);
		
	}
	
	}



}