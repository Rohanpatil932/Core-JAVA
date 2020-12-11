package com.xworkz.DTO;

public class MobileTester {
	public static void main(String[] args) {

		MobileDTO mobile = new MobileDTO();
		mobile.setBrandName("NOKIA");
		mobile.setBatteryCapacity(2200);
		mobile.setCameraInPixels(32);
		mobile.setColor("Black");
		mobile.setCost(12000.00f);
		System.out.println(mobile.getBrandName());
		mobile.setPurchaseDate("March2018");
		System.out.println(mobile.getBatteryCapacity());
		System.out.println(mobile.getCameraInPixels());
		System.out.println(mobile.getColor());
		System.out.println(mobile.getCost());
		System.out.println(mobile.getPurchaseDate());
		
		MobileDTO mobile1 = new MobileDTO();
		mobile1.setBrandName("IPhone");
		mobile1.setBatteryCapacity(2500);
		mobile1.setCameraInPixels(12);
		mobile1.setColor("white");
		mobile1.setCost(30000.00f);
		mobile1.setPurchaseDate("oct2020");
		System.out.println(mobile1.getBrandName());
		System.out.println(mobile1.getBatteryCapacity());
		System.out.println(mobile1.getCameraInPixels());
		System.out.println(mobile1.getColor());
		System.out.println(mobile1.getCost());
		System.out.println(mobile1.getPurchaseDate());
	}
}