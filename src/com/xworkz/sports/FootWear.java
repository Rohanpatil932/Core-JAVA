package com.xworkz.sports;

import com.xworkz.sports.Constant.FootWearType;

public class FootWear {
private int Size;
private String brand;
private double price;
private FootWearType footWearType;

public void protect() {
	System.out.println("Invoked protect");
}
public void displayDetails() {
	System.out.println(this.brand);
	System.out.println(this.Size);
	System.out.println(this.price);
	System.out.println(footWearType);
}
public int getSize() {
	return Size;
}
public void setSize(int size) {
	Size = size;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public FootWearType getFootWearType() {
	return footWearType;
}
public void setFootWearType(FootWearType footWearType) {
	this.footWearType = footWearType;
}

}
