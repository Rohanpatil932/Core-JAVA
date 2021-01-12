package com.xworkz.places.dto;

public class ZooDTO implements Cloneable {
	private String name;
	private int noOfAnimals;
	private boolean open;
	private double entryFees;
	private boolean safari;

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
	 * @return the noOfAnimals
	 */
	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	/**
	 * @param noOfAnimals the noOfAnimals to set
	 */
	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	/**
	 * @return the open
	 */
	public boolean isOpen() {
		return open;
	}

	/**
	 * @param open the open to set
	 */
	public void setOpen(boolean open) {
		this.open = open;
	}

	/**
	 * @return the entryFees
	 */
	public double getEntryFees() {
		return entryFees;
	}

	/**
	 * @param entryFees the entryFees to set
	 */
	public void setEntryFees(double entryFees) {
		this.entryFees = entryFees;
	}

	/**
	 * @return the safari
	 */
	public boolean isSafari() {
		return safari;
	}

	/**
	 * @param safari the safari to set
	 */
	public void setSafari(boolean safari) {
		this.safari = safari;
	}

	@Override
	public String toString() {
		return "ZooDTO [Name=" + name + ", noOfAnimals=" + noOfAnimals + ", open=" + open + ", entryFees=" + entryFees
				+ ", safari=" + safari + "]";
	}

	@Override
	public ZooDTO clone() throws CloneNotSupportedException {
		ZooDTO zooDTO = new ZooDTO();
		zooDTO.name = this.name;
		zooDTO.noOfAnimals = this.noOfAnimals;
		zooDTO.open = this.open;
		return zooDTO;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			System.out.println("class not equal to getClass");

			return false;
		}
		ZooDTO other = (ZooDTO) obj;
		if (other.name == null) {
			System.out.println("name is null");
			return false;
		} else if (!this.name.equals(other.name))
		{
			System.out.println("name is not equal");

			return false;
		}
		return true;
	}

}
