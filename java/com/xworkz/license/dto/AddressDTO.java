package com.xworkz.license.dto;

public class AddressDTO {

	private int doorNo;
	private String street;
	private int pinCode;
	private String area;
	private String city;
	private String state;
	private String buildingName;

	public AddressDTO() {

	}
	

	public AddressDTO(int doorNo, String street, int pinCode, String area, String city, String state,
			String buildingName) {
		this.doorNo = doorNo;
		this.street = street;
		this.pinCode = pinCode;
		this.area = area;
		this.city = city;
		this.state = state;
		this.buildingName = buildingName;
	}


	@Override
	public String toString() {
		return "AddressDTO [doorNo=" + doorNo + ", street=" + street + ", pinCode=" + pinCode + ", area=" + area
				+ ", city=" + city + ", state=" + state + ", buildingName=" + buildingName + "]";
	}

	/**
	 * @return the doorNo
	 */
	public int getDoorNo() {
		return doorNo;
	}

	/**
	 * @param doorNo the doorNo to set
	 */
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the pinCode
	 */
	public int getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the buildingName
	 */
	public String getBuildingName() {
		return buildingName;
	}

	/**
	 * @param buildingName the buildingName to set
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pinCode;
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
		AddressDTO other = (AddressDTO) obj;
		if (pinCode != other.pinCode)
			return false;
		return true;
	}

}
