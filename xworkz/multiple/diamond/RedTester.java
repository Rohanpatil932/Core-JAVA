package com.xworkz.multiple.diamond;

public class RedTester {

	public static void main(String[] args) {

		RedBusContractImpl impl = new RedBusContractImpl();
		impl.maxBooking();
		impl.minBooking();
		impl.totalYears();
		impl.close();

		Object object = new RedBusContractImpl();
		object.hashCode();

		Contract contract = new RedBusContractImpl();
		contract.maxBooking();
		contract.minBooking();

		Security security = new RedBusContractImpl();
		security.totalYears();

		RedBusContract busContract = new RedBusContractImpl();
		busContract.totalYears();
		busContract.maxBooking();
		busContract.minBooking();
		busContract.open();
		busContract.close();
	}

}
