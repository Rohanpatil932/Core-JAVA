package com.xworkz.resort.dto;

public class ResortDTO {

	private String name;
	private String location;
	private long phoneNo;
	private float price;
	private int noOfRooms;
	private String managerName;
	private boolean poolExists;
	private int noOfEmployees;
	private boolean offer;
	private float rating;

	public ResortDTO() {

	}

	public ResortDTO(String name, String location, float price, String managerName, boolean offer) {
		this.name = name;
		this.location = location;
		this.price = price;
		this.managerName = managerName;
		this.offer = offer;
	}

	@Override
	public String toString() {
		return "ResortDTO [name=" + name + ", location=" + location + ", phoneNo=" + phoneNo + ", price=" + price
				+ ", noOfRooms=" + noOfRooms + ", managerName=" + managerName + ", poolExists=" + poolExists
				+ ", noOfEmployees=" + noOfEmployees + ", offer=" + offer + ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResortDTO other = (ResortDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the phoneNo
	 */
	public long getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the noOfRooms
	 */
	public int getNoOfRooms() {
		return noOfRooms;
	}

	/**
	 * @param noOfRooms the noOfRooms to set
	 */
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	/**
	 * @return the poolExists
	 */
	public boolean isPoolExists() {
		return poolExists;
	}

	/**
	 * @param poolExists the poolExists to set
	 */
	public void setPoolExists(boolean poolExists) {
		this.poolExists = poolExists;
	}

	/**
	 * @return the noOfEmployees
	 */
	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	/**
	 * @param noOfEmployees the noOfEmployees to set
	 */
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	/**
	 * @return the offer
	 */
	public boolean isOffer() {
		return offer;
	}

	/**
	 * @param offer the offer to set
	 */
	public void setOffer(boolean offer) {
		this.offer = offer;
	}

	/**
	 * @return the rating
	 */
	public float getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(float rating) {
		this.rating = rating;
	}

}
