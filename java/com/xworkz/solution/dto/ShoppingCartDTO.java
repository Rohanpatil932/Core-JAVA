package com.xworkz.solution.dto;

public class ShoppingCartDTO {

	private String itemName;
	private int quantity;
	private double price;

	public ShoppingCartDTO() {
		super();
	}

	public ShoppingCartDTO(String itemName, int quantity, double price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShoppingCartDTO [itemName=" + itemName + ", quantity=" + quantity + ", price=" + price + "]";
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
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
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof ShoppingCartDTO) {
			ShoppingCartDTO casted=(ShoppingCartDTO)obj;
			if(this.itemName.equals(casted.itemName)) {
				System.out.println("price is equal");
				return true;
			}
		}
		return false;
	}
	
	

}
