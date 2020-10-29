public class ConversionTesting
{
		public static void main(String[]  test)
		{
				System.out.println("Invoked main method");
				
				String date="28";
				short convertedDate=Short.parseShort(date);
				System.out.println("converted date::"+convertedDate);
				
				String Police="100";
				byte convertedPolice=Byte.parseByte(Police);
				System.out.println("converted Police::"+convertedPolice);
				
				String Phone="6556";
				int convertedPhone=Integer.parseInt(Phone);
				System.out.println("converted Phone::"+convertedPhone);
				
				String Mobile="9665344007";
				long convertedLong=Long.parseLong(Mobile);
				System.out.println("converted Long::"+convertedLong);
				
				String EighthSem="87.8";
				float convertedMarks=Float.parseFloat(EighthSem);
				System.out.println("converted Marks::"+convertedMarks);
				
				String piValue="3.1415926";
				double convertedPi=Double.parseDouble(piValue);
				System.out.println("converted Pi::"+convertedPi);
				
				String earthIsFlat="false";
				boolean convertedEarthIsFlat=Boolean.parseBoolean(earthIsFlat);
				System.out.println("converted earthIsFlat : "+convertedEarthIsFlat);
				
				
				
				
			
			
			
			
			
		}





	
}



