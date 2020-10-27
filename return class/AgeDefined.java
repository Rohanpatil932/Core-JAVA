public class AgeDefined{

	public static String explained(int age){
	System.out.println("orderwise::"+age);
		if(age>0 && age<1){
		System.out.println("Should be called as Kid");
			return "Kid";
		}
		if(age>1 && age<3){
			System.out.println("Should be called as Toddler");
			return "Toddler";
		}
		if(age>3 && age<5){
			System.out.println("Should be called as preSchooler");
		return "preSchooler" ;
		}
		if(age>5 && age<12){
			System.out.println("Should be called as GradeSchooler");
			return "GradeSchooler";
		}
		if(age>12 && age<18){
			System.out.println("Should be called as Teen");
			return "Teen";
		}
		if(age>18 && age<21){
			System.out.println("Should be called as Young Adult");
			return "YoungAdult";
		}
		if(age>21 && age<45){
			System.out.println("Should be called as adult");
		return "adult";
		}
	if(age>45){
	System.out.println("Should be called as Old");		
	return "Old";	
	}
	return "anything";
	}


}