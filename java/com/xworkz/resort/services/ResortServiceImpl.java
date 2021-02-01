package com.xworkz.resort.services;

import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {

	private ResortDAO dao;
	String splchar = "^[^<>'\"/;`%]*$"; 

	public ResortServiceImpl(ResortDAO dao) {
		this.dao = dao;
	}

	@Override
	public void validateAndSave(ResortDTO dto) {
		System.out.println("invoked validateAndSave");
		System.out.println("first" + dto);
		boolean validData = false;
		if (dto != null) {
			String name = dto.getName();
			CharSequence splchar="@#$%^&!*";
			if (name != null && !name.isEmpty() && !name.contains(" ") && name.length() > 3
					&& name.length() < 12 && !name.contains(splchar)) {
				System.out.println("valid data ");
				validData = true;
			} else {
				System.out.println("data is invalid");
				validData = false;
			}
			String location = dto.getLocation();
			if (validData && location != null && !location.isEmpty() && !location.contains(" ")
					&& location.length() >= 3 && location.length() <= 13 && !location.contains(splchar)) {
				System.out.println("updating location " + location);
				validData = true;

			} else {
				System.out.println("invalid data");
				validData = false;
			}
			float price = dto.getPrice();
			if (validData && price >= 999 && price <= 2500) {
				System.out.println("updating price" + price);
				validData = true;
			} else {
				System.out.println("cant update price, data is invalid");
				validData = false;
			}
			int noOfEmployees = dto.getNoOfEmployees();
			if (validData && noOfEmployees >= 5 && noOfEmployees <= 25) {
				System.out.println("valid no. of employees");
				validData = true;
			} else {
				System.out.println("data invalid");
				validData = false;

			}
			float rating = dto.getRating();
			if (validData && rating >= 0 && rating <= 10) {
				System.out.println("rating is valid");
				validData = true;
			} else {
				System.out.println("invalid data");
				validData = false;
			}
			long phoneNo = dto.getPhoneNo();
			if (validData && phoneNo>700000000l && phoneNo<10000000000l) {
				System.out.println("no. is valid");
				validData = true;
			} else {
				System.out.println("no. is invalid");
				validData = false;
			}
			String managerName = dto.getManagerName();
			if (validData && managerName != null && !managerName.contains(" ") && !managerName.isEmpty()
					&& managerName.length() >= 3 && managerName.length() <= 12) {
				System.out.println("manager is valid");
				validData = true;
			} else {
				System.out.println("manager name is invalid");

			}

			if (validData) {
				dao.save(dto);
				System.out.println("saved to dao");
			} else {
				System.out.println("data cant be saved");
			}
		} else {
			System.out.println("dto is null cant validate");

		}
	}

	@Override
	public boolean updateLocationByName(String location, String Name) {
		System.out.println("update Location By Name");
		if (Name != null && !Name.isEmpty() && !Name.contains(" ") && Name.length() > 3 && Name.length() < 12
				&& location != null && !location.isEmpty() && !location.contains(" ") && location.length() >= 3
				&& location.length() <= 13) {
			System.out.println("validating location");
			this.dao.updateLocationByName(location, Name);
			return true;

		} else {
			System.out.println("invalid data");
		}

		return false;
	}

	@Override
	public boolean updateLocationByNameAndRating(String location, String name, float rating) {
		System.out.println("validating location name and rating");
		if (location != null && !location.isEmpty() && !location.contains(" ") && location.length() >= 3
				&& location.length() <= 13 && rating >= 0 && rating <
			 10 && name != null && !name.isEmpty()
				&& !name.contains(" ") && name.length() > 3 && name.length() < 12) {
			System.out.println("updating location " + location);
			this.dao.updateLocationByNameAndRating(location, name, rating);
			return true;

		} else {
			System.out.println("invalid data");
		}
		return false;
	}

	@Override
	public boolean deleteLocationByName(String name, String location) {
		System.out.println("validating location for delete location by name");
		if (name != null && !name.isEmpty() && !name.contains(" ") && name.length() > 3 && name.length() < 12
				&& location != null && !location.isEmpty() && !location.contains(" ") && location.length() >= 3
				&& location.length() <= 13) {
			System.out.println("validate data");
			this.dao.deleteLocationByName(name, location);
			return true;
		} else {
			System.out.println("data cant be validated");
		}
		return false;
	}




}
