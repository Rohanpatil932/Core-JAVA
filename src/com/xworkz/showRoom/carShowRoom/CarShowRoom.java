package com.xworkz.showRoom.carShowRoom;

import com.xworkz.showRoom.DTO.CarDTO;

import com.xworkz.showRoom.DTO.ManagerDTO;
import com.xworkz.showRoom.constatnt.CarVariant;

import java.util.Arrays;

public class CarShowRoom {
	private String name;
	private String location;
	private ManagerDTO managerDTO;
	CarDTO[] cars = new CarDTO[5];
	private int currentIndex = 0;

	public CarShowRoom() {
		super();
	}

	public CarShowRoom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void addManager(String name, long contactNo) {
		if (name != null && contactNo > 0) {
			this.managerDTO = new ManagerDTO(name, contactNo);
			System.out.println("manager added, data is valid");
		} else {
			System.out.println("provide proper details,data is invalid");
		}
	}

	public void addManager(ManagerDTO dto) {
		if (dto != null) {
			this.managerDTO = dto;
			System.out.println("manager added");
		} else {
			System.out.println("manager not added, data is invalid");
		}
	}

	public void displayManager() {
		if (this.managerDTO != null) {
			System.out.println(this.managerDTO.getName());
			System.out.println(this.managerDTO.getContactNo());
		} else {
			System.out.println("manager is not there :: null");
		}
	}

	public void removeManager() {
		this.managerDTO = null;
	}

	public void updateManager(long contactNo) {
		if (contactNo > 0 && this.managerDTO != null) {
			this.managerDTO.setContactNo(contactNo);
			System.out.println(" updated contact number");
		} else {
			System.out.println(",data is invalid");
		}

	}

	public void updateManager(String name) {
		if (name != null && this.managerDTO != null) {
			this.managerDTO.setName(name);
			System.out.println("details are valid, updated name");
		} else {
			System.out.println("cannot update name,data is invalid");
		}

	}

	public void addCar(CarDTO dto) {
		if (dto != null && this.currentIndex < 5) {
			System.out.println("add car");
			System.out.println("current Index" + this.currentIndex);
			this.cars[currentIndex] = dto;
			this.currentIndex++;
		}

	}

	public void displayCars() {

		for (int i = 0; i < this.cars.length; i++) {
			CarDTO dto = this.cars[i];
			System.out.println(dto.getBrand());
			System.out.println(dto.getPrice());
			System.out.println(dto.getVariant());
		}
	}

	public void UpdateCarVariant(CarVariant newVariant, int indexToUpdate) {
		if (newVariant != null && indexToUpdate >= 0 && indexToUpdate < 5) {
			System.out.println("Car Found at" + indexToUpdate);
			System.out.println("updating variant" + newVariant);
			CarDTO cardto = this.cars[indexToUpdate];
			cardto.setVariant(newVariant);
		}

	}

	public void displayBAtIndex(int IndexToDisplay) {

		if (IndexToDisplay >= 0 && IndexToDisplay < 5) {
			System.out.println("Car At Index" + IndexToDisplay);
			CarDTO reference = this.cars[IndexToDisplay];
			System.out.println(reference.getBrand());
			System.out.println(reference.getPrice());
			System.out.println(reference.getVariant());
		}
	}

	public void displayCarByBrand(String brand) {

		if (brand != null) {
			System.out.println("Car model is: " + brand);
			boolean carFound = false;
			for (int i = 0; i < this.cars.length; i++) {
				CarDTO ref = this.cars[i];
				String model=ref.getBrand();
				if(brand.equals(model)) {
				System.out.println("Car is found");
				System.out.println(ref.getBrand());
				System.out.println(ref.getPrice());
				System.out.println(ref.getVariant());
			}
		}
	}}


	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
