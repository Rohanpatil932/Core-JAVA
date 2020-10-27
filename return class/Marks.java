public class Marks{


public static String report(double percentage) {
	System.out.println("percentage"+percentage);
	if(percentage<35){
		System.out.println("Fail");
	return "fail";
	}
	if(percentage>35 && percentage<60){
		System.out.println("Second class");
		return "second class";
	}
	if(percentage>60 && percentage<75){
		System.out.println("First class");
	return "First class";
	}
	if(percentage>75){
		System.out.println("Distinction");
		return "Distinction";
	}
	
	return "Pass";
	
}

}