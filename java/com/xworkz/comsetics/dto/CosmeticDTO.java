package com.xworkz.comsetics.dto;

import com.xworkz.comsetics.constants.CosmeticShade;
import com.xworkz.comsetics.constants.CosmeticType;

public class CosmeticDTO {

	private String brand;
	private CosmeticShade shades;
	private CosmeticType type;
	private double price;
	private int quantity;

	public CosmeticDTO() {
	}

	public CosmeticDTO(String brand, CosmeticShade shades, CosmeticType type, double price, int quantity) {
		this.brand = brand;
		this.shades = shades;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", shades=" + shades + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the shades
	 */
	public CosmeticShade getShades() {
		return shades;
	}

	/**
	 * @param shades the shades to set
	 */
	public void setShades(CosmeticShade shades) {
		this.shades = shades;
	}

	/**
	 * @return the type
	 */
	public CosmeticType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(CosmeticType type) {
		this.type = type;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof CosmeticDTO) {
			CosmeticDTO casted = (CosmeticDTO) obj;
			if (this.brand.equals(casted.brand) && this.type.equals(casted.type))
				System.out.println("brands and types are equal");
			return true;
		}else {
			System.out.println("brands are not equal");
		}
		return false;

		
	}

}
