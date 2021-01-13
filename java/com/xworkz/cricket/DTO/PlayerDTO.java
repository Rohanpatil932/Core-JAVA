package com.xworkz.cricket.DTO;

public class PlayerDTO {
	private String name;
	private int jersyNo;
	private String sport;

	public void setName(String name) {
		this.name = name;
	}

	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getJersyNo() {
		return jersyNo;
	}

	public String getName() {
		return name;
	}

	public String getSport() {
		return sport;
	}

	@Override
	public String toString() {
		return "PlayerDTO [name=" + name + ", jersyNo=" + jersyNo + ", sport=" + sport + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				System.out.println("its equal");
				return true;
				
			} else {
				if (obj instanceof PlayerDTO) {
					PlayerDTO dto = (PlayerDTO) obj;
					if (dto.jersyNo == this.jersyNo) {
						return false;
						
					} else {
						System.out.println("jersy is not equal");
					}

				}
			}
			
		}
		return false;

	}

	@Override
	protected PlayerDTO clone() throws CloneNotSupportedException {
		PlayerDTO dto = new PlayerDTO();
		dto.name = this.name;
		dto.sport = this.sport;
		dto.jersyNo=this.jersyNo;
		return dto;
	}

}
