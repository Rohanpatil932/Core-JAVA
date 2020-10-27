public class Nokia{

	public static boolean call(){
	System.out.println("Invoked call");
	boolean connected=true;
	return connected;
	}
	 
	public static String camera(){
	System.out.println("Invoked camera");
	String click="pixel";
	return click;
	}
	
	public static byte charging(double battery)
	{
		System.out.println("Invoked charging");
		System.out.println("battery"+ battery);
		if(battery>50)
		{
			System.out.println("battery is greater than 50%");
			return 100;
		}	
			if(battery<50 && battery>0){
				System.out.println("battery is less than 50% ");
			return 0;
			}
			return 0;
		
		
		
		
		
	
	
	
	
	
	}	
	
	







}

