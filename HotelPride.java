package basics;

public class HotelPride {
	private static String[] items = { "Idli", "Dosa", "Puri", "Vada pav","Pohe","Upma","Coffee","Tea" ,"Pani puri",""};

	public static void Menu(String product) {
		System.out.println("Total items available" + items.length);
		System.out.println("FoodItem :" + product);
		boolean itemFound = false;
		for (int count = 0; count < items.length; count++) {
			String item = items[count];
			if (item.equals(product)) {
				itemFound = true;
				break;
			} else {
				itemFound = false;
			}

		}

		if (itemFound) {
			System.out.println("item found ");
		} else {
			System.out.println("item not found");
		}

	}

	public static int totalItems() {
		return items.length;
	}

}


