package com.xworkz.license.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO {

	private List<LicenseDTO> database;

	public LicenseDAOImpl() {
		this.database = new ArrayList<LicenseDTO>();
	}

	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoked save in dao impl");
		System.out.println("dto to save" + dto);
		boolean saved = this.database.add(dto);
		if (saved)
			System.out.println("saved in list");
		else
			System.out.println("not saved");
	}

	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("lets find by id proof");
		System.out.println("id proof" + idProofNo);
		for (LicenseDTO licenseDTO : this.database) {
			String proof = licenseDTO.getIdProofNo();
			if (proof.equals(idProofNo)) {
				System.out.println("id proof matched");
				return licenseDTO;
			} else {
				System.out.println("insert correct id");
			}
		}
		return null;

	}

	@Override
	public boolean UpdateVehicleTypeByIdNo(String idproof, VehicleType type) {
		System.out.println("update vehicle type by idno");
		System.out.println("id" + idproof);
		System.out.println("type" + type);
		LicenseDTO Dtofromdb = this.findByIdProofNo(idproof);
		if (Dtofromdb != null) {
			System.out.println("changed type");
			Dtofromdb.setVehicleType(type);
			return true;
		} else {
			System.out.println("cant add type");
		}

		return false;
	}

	@Override
	public IdProof deleteByIdNo(IdProof idProof) {
		System.out.println("delete by no.");
		System.out.println("delete" + idProof);
Iterator<LicenseDTO> iterator=this.database.iterator();
while (iterator.hasNext()) {
	LicenseDTO dto = iterator.next();
	if(dto.getIdProof().equals(idProof)) {
		iterator.remove();
		System.out.println("deleting by id proof"+dto);
		
	}else{
		System.out.println("incorrect id proof");
	}
	
}
return null;
		
	}

	

}
