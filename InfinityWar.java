public class InfinityWar
{
	public static void main(String[] superhero)
	{
		System.out.println("JVM invoked main");
		String[] avengers= {"IronMan","Thor","Hulk","America","Hawkeye","BlackPanther"};
		heroes(avengers);
		heroes(null);
		System.out.println("JVM  main exit");
	
		
	}
	public static void heroes(String[] names)
	{
	
	System.out.println("heroes"+names);
	int size= names.length;
	System.out.println(size);
	String firstAvenger=names[0];

	System.out.println("heroes @ index 1"+names[1]);
	System.out.println("heroes @ index 0"+names[0]);
		System.out.println("heroes @ index 4"+names[4]);

	
	
	}
	
	
}