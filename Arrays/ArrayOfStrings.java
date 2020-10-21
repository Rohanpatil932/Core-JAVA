public class ArrayOfStrings{
	public static void main(String[] group){
	
	arrayOfEmail();
	}
	
	public static void arrayOfEmail(){
	String myEmail="rohanpatil932@gmail.com";
	String myXworkzEmail="rohanpatilxworkx@gmail.com";
	String anotherEmail="rohanpatil4190@gmail.com";
	
	String[] emails={myEmail,myXworkzEmail,anotherEmail};
	int sizeOfArray=emails.length;
	System.out.println("total elements"+sizeOfArray);
	String elementsAtIndexOne=emails[1];
	System.out.println("elementsAtIndexOne:"+elementsAtIndexOne);
	String elementsAtIndexTwo=emails[2];
	System.out.println("elementsAtIndexTwo:"+elementsAtIndexTwo);
	String elementsAtIndexzero=emails[0];
	System.out.println("elementsAtIndexzero:"+elementsAtIndexzero);
	
	}
}
	