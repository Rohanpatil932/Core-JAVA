public class ArrayOfPercentage
{
	public static void main(String[] less)
	{
	
	ArrayOfPercentage();
	}
	public static void ArrayOfPercentage()
	{
	float tenthPercentage=73.54f;
	float twelthPercentage=54.52f;
	float eighthSem=87.88f;
	
	float[] percentages={tenthPercentage,twelthPercentage,eighthSem};
	int sizeOfArray=percentages.length;
	System.out.println("Elements"+sizeOfArray);
	
	float elementsAtIndexTwo=percentages[2];
	System.out.println("elementsAtIndexTwo:"+elementsAtIndexTwo);
	float elementsAtIndexOne=percentages[1];
	System.out.println("elementsAtIndexOne:"+elementsAtIndexOne);
	float elementsAtIndexZero=percentages[0];
	System.out.println("elementsAtIndexOne:"+elementsAtIndexZero);
	}
	}
	