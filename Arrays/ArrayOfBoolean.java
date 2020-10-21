public class ArrayOfBoolean
{
	public static void main(String[] less)
	{
	
	ArrayOfBoolean();
	}
	public static void ArrayOfBoolean()
	{
	boolean nameRohan=true;
	boolean NickNameRP=false;
	boolean surnamePatil=true;

	
	boolean[] booleans={nameRohan,NickNameRP,surnamePatil};
	int sizeOfArray=booleans.length;
	System.out.println("Elements"+sizeOfArray);
	
	boolean elementsAtIndexTwo=booleans[2];
	System.out.println("elementsAtIndexTwo:"+elementsAtIndexTwo);
	boolean elementsAtIndexOne=booleans[1];
	System.out.println("elementsAtIndexOne:"+elementsAtIndexOne);
	boolean elementsAtIndexZero=booleans[0];
	System.out.println("elementsAtIndexZero:"+elementsAtIndexZero);
	}
	}
	