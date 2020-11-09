public class SportTester
{
	
	public static void main(String[] national)
	{
		
		String sportChess="CHESS";
		Sport convertedChessFromString=Sport.valueOf(sportChess);
		System.out.println("converted Chess From String::"+convertedChessFromString);
		
		Sport[] allSports=Sport.values();
		System.out.println(allSports.length);
		for(int sportCount=0;sportCount<allSports.length;sportCount++)
		{
			
			System.out.println("INDEX"+sportCount);
			Sport sportValue=allSports[sportCount];
			System.out.println("sportValue:::"+sportValue);
		}
		
	}
	
	
	
	
}