public class robber{
	
public static void steal()
{
	System.out.println("invoked steal");

	double pocket=AgroFarm.getBudget();
	System.out.println("steal budget "+pocket);
	System.out.println("AgroFarm budget "+AgroFarm.getBudget());
	System.out.println("EXIT :: steal");

}

}