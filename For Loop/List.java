public class List{
	
	public static void printThis()
	{
		for (byte area=0; area<=4; area++)
		{ 
	System.out.println("Winter is here");
		}
		
	}
	
		public static void printThis(int loopSize)
		{
			
for (byte area=0; area<=loopSize; area++)
{
	System.out.println("Winter is here"+area);
	
}
}

public static void groupAndLoop()
{
	String[] printing={"now or never", "Be the First", "Always there for u",  "welcome"};
	System.out.println("size"+ printing.length);
	for ( int size=0; size<printing.length; size++)
	{
		System.out.println("counting"+size);
		String may=printing[size];
		System.out.println("message"+may);
	}
}
}