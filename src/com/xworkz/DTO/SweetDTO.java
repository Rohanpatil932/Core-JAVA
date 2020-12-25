package com.xworkz.DTO;

public class SweetDTO {
	String name;
	int price;
	String[] popularState;
	ColorOfSweet color;
	ShapeOfSweet shape;
	
	public SweetDTO() {
		
	}

	public SweetDTO(String name, int price, String[] popularState) {
		super();
		this.name = name;
		this.price = price;
		this.popularState = popularState;
	}

	public SweetDTO(String name, int price, String[] popularState, ColorOfSweet color, ShapeOfSweet shape) {
		super();
		this.name = name;
		this.price = price;
		this.popularState = popularState;
		this.color = color;
		this.shape = shape;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String[] getPopularState() {
		return popularState;
	}

	public void setPopularState(String[] popularState) {
		this.popularState = popularState;
	}

	public ColorOfSweet getColor() {
		return color;
	}

	public void setColor(ColorOfSweet color) {
		this.color = color;
	}

	public ShapeOfSweet getShape() {
		return shape;
	}

	public void setShape(ShapeOfSweet shape) {
		this.shape = shape;
	}
	
	
	

}
