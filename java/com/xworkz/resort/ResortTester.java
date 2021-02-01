package com.xworkz.resort;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.services.ResortService;
import com.xworkz.resort.services.ResortServiceImpl;

public class ResortTester {

	public static void main(String[] args) {

		List<ResortDTO> list = new LinkedList<ResortDTO>();

		ResortDTO resortDTO = new ResortDTO("vivanta", "fcRoad", 2000, "Ashok", true);

		//ResortDTO resortDTO2 = new ResortDTO("New pride", "Mg road", 2, "Mr.Naresh", true);
		resortDTO.setRating(9.5f);
		resortDTO.setPhoneNo(9665344007l);
		resortDTO.setNoOfRooms(20);
		resortDTO.setPoolExists(true);
		resortDTO.setNoOfEmployees(10);
		resortDTO.setOffer(true);

		ResortDAO resortDAOImpl = new ResortDAOImpl(list);

		ResortService resortService = new ResortServiceImpl(resortDAOImpl);

		resortDAOImpl.save(resortDTO);

		//resortDAOImpl.save(resortDTO2);

		resortService.validateAndSave(resortDTO);

		resortDAOImpl.searchByName("vivanta");
		

		// resortDAOImpl.updateLocationByName("brigade road", "vivanta");

		resortService.updateLocationByName("brigaderoad", "vivanta");

		//resortDAOImpl.updateLocationByNameAndRating("national college", "vivanta", 9.5f);
		resortService.updateLocationByNameAndRating("nationalClg", "vivanta", 9.5f);

		//resortDAOImpl.deleteLocationByName("vivanta", "national college");
		
		resortService.deleteLocationByName("vivanta", "nationalClg");
		
		System.out.println(resortDTO);
		
//		List<ResortDTO> resort = resortDAOImpl.getAll();
//		System.out.println(resort);

		resortDAOImpl.getAll();

		resortDAOImpl.totalResortSize();
		
		

	}

}
