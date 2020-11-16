package basics;

public class PhoneDirectory 
{
	private static String[] numbers= {"9881566550","9923238550","9665344007","8390621700","8308332166","9096336501","9923098282"};
	
	public static void show(String contacts) 
	{
	System.out.println("jvm invoked main");
		System.out.println("show length::"+numbers.length);
		System.out.println("first no::"+contacts);
		boolean numbersFound=false;
		for(int phone=0;phone<numbers.length;phone++) 
		{
			String showing=numbers[phone];
			if(showing.equals(contacts)) 
			{
				numbersFound=true;
				break;
				}
			
			else 
			{
				numbersFound=false;	
		}
		}
		if(numbersFound)
		{
		System.out.println("number found");	
		}
		else {
		System.out.println("number not found");	
		}
		
	}

public static int totalNumbers() {
	return numbers.length;
}
}

