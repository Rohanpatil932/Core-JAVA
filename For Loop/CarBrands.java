public class CarBrands{
	
public static void AllBrands()
{
	String[] brands={"TOYOTA", "MARUTI SUZUKI", "BMW",  "RANGE ROVER", "KIA","MG"};
	System.out.println("size"+ brands.length);
	for ( int size=0; size<brands.length; size++)
	{
		System.out.println("counting"+brands);
		String may=brands[size];
		System.out.println("message"+may);
	}
}
}