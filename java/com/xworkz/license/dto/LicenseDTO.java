package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;

public class LicenseDTO extends CommonDTO {

	private IdProof idProof;
	private String idProofNo;
	private VehicleType vehicleType;
	private Date startdate;
	private boolean disablity;
	private boolean commercial;

	public LicenseDTO() {
		super();
	}

	public LicenseDTO(String name, int age, AddressDTO addressDTO, Date dOB, long mobileNo, BloodGroup bloodGroup,
			Gender gender) {
		super(name, age, addressDTO, dOB, mobileNo, bloodGroup, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LicenseDTO [idProof=" + idProof + ", idProofNo=" + idProofNo + ", vehicleType=" + vehicleType
				+ ", startdate=" + startdate + ", disablity=" + disablity + ", commercial=" + commercial + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProof == null) ? 0 : idProof.hashCode());
		result = prime * result + ((idProofNo == null) ? 0 : idProofNo.hashCode());
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
		LicenseDTO other = (LicenseDTO) obj;
		if (idProof != other.idProof)
			return false;
		if (idProofNo == null) {
			if (other.idProofNo != null)
				return false;
		} else if (!idProofNo.equals(other.idProofNo))
			return false;
		return true;
	}

	/**
	 * @param idProof the idProof to set
	 */
	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}

	/**
	 * @param idProofNo the idProofNo to set
	 */
	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @param startdate the startdate to set
	 */
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	/**
	 * @param disablity the disablity to set
	 */
	public void setDisablity(boolean disablity) {
		this.disablity = disablity;
	}

	/**
	 * @param commercial the commercial to set
	 */
	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}

	public IdProof getIdProof() {
		return idProof;
	}

	public String getIdProofNo() {
		return idProofNo;
	}

}
