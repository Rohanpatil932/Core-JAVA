package com.xworkz.resort.services;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortService {

	public void validateAndSave(ResortDTO dto);
	
	public boolean updateLocationByName(String location, String Name);
	
	public boolean updateLocationByNameAndRating(String location, String name, float rating);

	public boolean deleteLocationByName(String name, String location);



	
}
