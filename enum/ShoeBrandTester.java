public class ShoeBrandTester
{
public static void main(String[] top)
{
String ShoeBrandsquality="PUMA";
ShoeBrands display=ShoeBrands.valueOf(ShoeBrandsquality);
System.out.println("display::"+display);

ShoeBrands[] famous=ShoeBrands.values();
System.out.println(famous.length);
for( int brands=0;brands<famous.length;brands++)
{
	System.out.println("Index"+brands);
	ShoeBrands value=famous[brands];
	System.out.println(value);
}

}
}