package com.xworkz.sports;

public class ShoeFootWear extends FootWear{

	public double displayDiscount() {
		double price=super.getPrice();
		double discount=0;
		if(price<1000) {
			discount=100;
		}
		if(price<2000) {
			discount=200;
		}
		if(price<4000)
			discount=400;
		return discount;
	}
}
