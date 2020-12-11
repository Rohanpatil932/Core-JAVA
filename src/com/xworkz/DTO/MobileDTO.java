package com.xworkz.DTO;

public class MobileDTO {
	private String color;
	private int batteryCapacity;
	private String purchaseDate;
	private float Cost;
	private String brandName;
	private int CameraInPixels;
	
	public MobileDTO() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public float getCost() {
		return Cost;
	}

	public void setCost(float cost) {
		Cost = cost;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getCameraInPixels() {
		return CameraInPixels;
	}

	public void setCameraInPixels(int cameraInPixels) {
		CameraInPixels = cameraInPixels;
	}
	
	

}
