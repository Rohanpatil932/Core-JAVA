package com.xworkz.resort.dao;

import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public interface ResortDAO {

	public boolean save(ResortDTO dto);

	public ResortDTO searchByName(String Name);

	public boolean updateLocationByName(String location, String Name);

	public boolean updateLocationByNameAndRating(String location, String name, float rating);

	public boolean deleteLocationByName(String name, String location);

	List<ResortDTO> getAll();

	public int totalResortSize();

	public boolean addMultipleResort(List<ResortDTO> dtos);

}
