package com.xworkz.license.dao;

import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dto.LicenseDTO;

public interface LicenseDAO {

	void save(LicenseDTO dto);

	LicenseDTO findByIdProofNo(String idProofNo);

	boolean UpdateVehicleTypeByIdNo(String idproof, VehicleType type);

	IdProof deleteByIdNo(IdProof adhar);
}
