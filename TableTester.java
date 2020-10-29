public class TableTester
{
	public static void main(String[] smtg)
	{
		System.out.println("JVM invoked");
		System.out.println("length"+smtg.length);
		
		String pen="CODE";
		Table.holding(pen,"pencil");

		Table.holding(pen,8);

		Table.holding(pen,"scale");
	
	}


}