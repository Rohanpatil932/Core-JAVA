package basics;

public class BusStops {
	private static String[] buses = { "banglore", "Mysore", "hubbali","Dharwad","belgavi","kolhapur","pune","mumbai" };

	public static void area(String place) {
		System.out.println("Total buses available" + buses.length);
		System.out.println("place is :" + place);
		boolean placeFound = false;
		for (int count = 0; count < buses.length; count++) {
			String item = buses[count];
			if (item.equals(place)) {
				placeFound = true;
				break;
			} else {
				placeFound = false;
			}

		}

		if (placeFound) {
			System.out.println("place found ");
		} else {
			System.out.println("Place not found");
		}
    }
}
