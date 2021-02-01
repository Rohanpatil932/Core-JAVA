package com.xworkz.solution.dto;

public class AlcoholDTO {
	private String name;
	private String brandName;
	private int spiritPercentage;

	public AlcoholDTO() {
		super();
	}

	public AlcoholDTO(String name, String brandName, int spiritPercentage) {
		super();
		this.name = name;
		this.brandName = brandName;
		this.spiritPercentage = spiritPercentage;
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
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	/**
	 * @return the spiritPercentage
	 */
	public int getSpiritPercentage() {
		return spiritPercentage;
	}

	/**
	 * @param spiritPercentage the spiritPercentage to set
	 */
	public void setSpiritPercentage(int spiritPercentage) {
		this.spiritPercentage = spiritPercentage;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", brandName=" + brandName + ", spiritPercentage=" + spiritPercentage + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlcoholDTO other = (AlcoholDTO) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		return true;
	}

}
