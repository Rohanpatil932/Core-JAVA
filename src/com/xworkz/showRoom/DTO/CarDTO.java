package com.xworkz.showRoom.DTO;
import com.xworkz.showRoom.constatnt.CarVariant;

public class CarDTO {
	private String Brand;
	private long price;
	private CarVariant variant;

	public CarDTO() {
		super();
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}



	public CarVariant getVariant() {
		return variant;
	}

	public void setVariant(CarVariant variant) {
		this.variant = variant;
	}

	

	public CarDTO(String brand, long price, CarVariant variant) {
		super();
		Brand = brand;
		this.price = price;
		this.variant = variant;
	}

}
