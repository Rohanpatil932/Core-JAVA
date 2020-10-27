public class QualityCheck{

public static void main(String[] smtg)
{
System.out.println("invoked JVM");

boolean test=Nokia.call();
System.out.println("Result::"+test);

String pixel=Nokia.camera();
System.out.println("quality  in::"+pixel);

System.out.println("Exit::");

byte volts=Nokia.charging(45);
System.out.println("value ::"+volts);




}



}