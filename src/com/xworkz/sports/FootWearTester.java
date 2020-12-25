package com.xworkz.sports;

import com.xworkz.sports.Constant.FootWearType;

public class FootWearTester {
public static void main(String[] args) {
	FootWear footWear=new FootWear();
	ShoeFootWear shoeFootWear=new ShoeFootWear();
	footWear.setBrand("Nike");
	System.out.println(footWear.getBrand());
	footWear.setPrice(3999.50);
	System.out.println(footWear.getPrice());
	footWear.setSize(9);
	System.out.println(footWear.getSize());
	shoeFootWear.setFootWearType(FootWearType.FORMAL);
	System.out.println(shoeFootWear.getFootWearType());
	double dis=shoeFootWear.displayDiscount();
	System.out.println("discount::"+dis);
}
}
