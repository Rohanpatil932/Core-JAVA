package com.xworkz.license;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.impl.LicenseDAOImpl;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {

		AddressDTO addressDTO = new AddressDTO(218, "near jain mandir", 416005, "herle", "Kolhapur", "Maharshra", "NA");

		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat();
		try {
			date = format.parse("06/10/1996");
		} catch (ParseException e) {

		}

		LicenseDTO licenseDTO = new LicenseDTO("Rohan", 25, addressDTO, date, 9665344007l, BloodGroup.B_POSITIVE,
				Gender.MALE);
		licenseDTO.setCommercial(false);
		licenseDTO.setDisablity(false);
		licenseDTO.setIdProof(IdProof.ADHAR);
		licenseDTO.setIdProofNo("3056 5526 0216");
		licenseDTO.setStartdate(new Date());
		licenseDTO.setVehicleType(VehicleType.LMV);

		LicenseDAO dao = new LicenseDAOImpl();
		dao.save(licenseDTO);

		LicenseDTO found = dao.findByIdProofNo(null);
		System.out.println(found);
		
		boolean updated=dao.UpdateVehicleTypeByIdNo("3056 5526 0216", VehicleType.TWO_WHEELER);
		System.out.println(updated);
		
		
dao.deleteByIdNo(IdProof.ADHAR);


	}

}
