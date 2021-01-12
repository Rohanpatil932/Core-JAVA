package com.xworkz.places.dto;

public class PalaceDTO implements Cloneable {

	private String location;
	private String kingName;
	private String queenName;

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
	 * @return the kingName
	 */
	public String getKingName() {
		return kingName;
	}

	/**
	 * @param kingName the kingName to set
	 */
	public void setKingName(String kingName) {
		this.kingName = kingName;
	}

	/**
	 * @return the queenName
	 */
	public String getQueenName() {
		return queenName;
	}

	/**
	 * @param queenName the queenName to set
	 */
	public void setQueenName(String queenName) {
		this.queenName = queenName;
	}

	@Override
	public PalaceDTO clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (PalaceDTO) super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				return true;
			} else {
				if (obj instanceof PalaceDTO) {
					PalaceDTO dto = (PalaceDTO) obj;
					if (getLocation() == this.location) {
						return false;
					}
				}
			}
			return false;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "PalaceDTO [location=" + location + ", kingName=" + kingName + ", queenName=" + queenName + "]";
	}

}
