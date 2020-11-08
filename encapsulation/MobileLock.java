public class MobileLock
{

	private  static String unlock="Pin";
	public static String getUnlock()
	{
		return unlock;
	}
	public static void setUnlock(String newUnlock)
	{

		if(newUnlock.equals("FingerPrint") || newUnlock.equals("pattern") || newUnlock.equals("password")|| newUnlock.equals("face") || )	
		{
			System.out.println("new unlock is "+newUnlock);
			unlock=newUnlock;
		}
		else{
			System.out.println("Wrong password");
		}

	}
} 