public class MobileTester{


	public static void main(String[] runTime)
{
System.out.println("JVM invoked main");

String value=runTime[0];
String unlockValue=Mobile.getUnlock();

System.out.println("unlockValue"+unlockValue);

Mobile.setUnlock(value);

unlockValue=Mobile.getUnlock();

System.out.println("unlockValue"+unlockValue);

System.out.println("EXIT :: main");

}

}