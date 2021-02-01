package com.xworkz.resort.dao;

import java.util.Iterator;
import java.util.List;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	List<ResortDTO> resortList;

	public ResortDAOImpl(List<ResortDTO> resortDTOs) {
		System.out.println("resort impl invoked");
		this.resortList = resortDTOs;

	}

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("save method");
		boolean saved = this.resortList.contains(dto);
		if (!saved) {
			this.resortList.add(dto);
			System.out.println("added" + dto);
		} else {
			System.out.println("saved already");

		}
		return saved;
	}

	@Override
	public ResortDTO searchByName(String Name) {
		System.out.println("search by name");
		System.out.println("name" + Name);
		for (ResortDTO resortDTO : this.resortList) {
			String get = resortDTO.getName();
			if (get.equals(Name)) {
				System.out.println("name found" + resortDTO);
				return resortDTO;
			} else {
				System.out.println("name not found");
			}
		}
		return null;
	}

	@Override
	public boolean updateLocationByName(String location, String Name) {
		System.out.println("brand" + Name);
		System.out.println("location" + location);
		ResortDTO searchByName = this.searchByName(Name);
		if (searchByName != null) {
			System.out.println("updating location");
			searchByName.setLocation(location);
			System.out.println(this.resortList);
			return true;
		} else {
			System.out.println("cant find name to update");
		}

		return false;
	}

	@Override
	public boolean updateLocationByNameAndRating(String location, String name, float rating) {
		System.out.println("name" + name);
		System.out.println("location" + location);
		System.out.println("rating" + rating);
		ResortDTO ByName = this.searchByName(name);
		for (ResortDTO resortDTO : resortList) {
			String getname = resortDTO.getName();
			float getrating = resortDTO.getRating();
			if (getname.equals(name) && getrating == rating) {
				System.out.println("updating location by name and rating");
				resortDTO.setLocation(location);
				System.out.println(resortDTO);
			} else {
				System.out.println("cant update location");
			}

		}
		return false;
	}

	@Override
	public boolean deleteLocationByName(String name, String location) {
		System.out.println("name" + name);
		System.out.println("location" + location);
		Iterator<ResortDTO> iterator = this.resortList.iterator();
		while (iterator.hasNext()) {
			ResortDTO dto = iterator.next();
			if (dto.getName().equals(name) && dto.getLocation().equals(location)) {
				System.out.println("location found can delete");
				iterator.remove();
				System.out.println("location deleted"+dto);
				return true;
			} else {
				System.out.println("location not found");
			}

		}
		return false;

	}

	@Override
	public List<ResortDTO> getAll() {
//		for (ResortDTO resortDTO : resortList) {
//			System.out.println("all elements" + resortDTO);
//		}
		return this.resortList;
	}

	@Override
	public int totalResortSize() {
		int size = this.resortList.size();
		System.out.println("size is "+size);
		return size;
	}

	@Override
	public boolean addMultipleResort(List<ResortDTO> dtos) {
		// TODO Auto-generated method stub
		return false;
	}

}
