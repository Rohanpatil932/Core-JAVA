package basics;

public class Myntra {
private static String[] All= {"Mobile","Laptop","Tab","Cosmetics", "Jewelleries", "headphones", "Electronic items", "Furniture",
		"Suitcsaes", "Bag packs", "Sun Glasses", "Gift cards", "Laptop", "Home decor's"};
	
public static void find(String product) {
System.out.println("JVM invoked");	
System.out.println("Length is "+All.length);
	System.out.println("First is::"+product);
	boolean itemFound=false;
	for(int count=0;count<All.length;count++) {
	String item	=All[count];
	if(item.equals(product)) {
	itemFound=true;
	break;
	}
	else {
		
		itemFound=false;	
		
	}
	}
	if(itemFound) {
		System.out.println("item is found");
	}
	else {
		System.out.println("item not found");
	}
}
	public static int totalItems() {
		return All.length;
	}
	





	
}
