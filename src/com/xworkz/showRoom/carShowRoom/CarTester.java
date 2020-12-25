package com.xworkz.showRoom.carShowRoom;

import com.xworkz.showRoom.DTO.CarDTO;
import com.xworkz.showRoom.constatnt.CarVariant;
import com.xworkz.showRoom.DTO.CarDTO;

public class CarTester {
	public static void main(String[] args) {
		CarShowRoom carShowRoom = new CarShowRoom();

		CarDTO dto = new CarDTO();
		dto.setBrand("Range Rover");
		dto.setPrice(4000000l);
		dto.setVariant(CarVariant.base);

		carShowRoom.addCar(dto);
		CarDTO dto2 = new CarDTO("rolls royce", 6000000, CarVariant.top);
		carShowRoom.addCar(dto2);
		CarDTO dto3 = new CarDTO("Baleno", 900000, CarVariant.base);
		carShowRoom.addCar(dto3);
		CarDTO dto4 = new CarDTO("BMW", 3500000, CarVariant.top);
		carShowRoom.addCar(dto4);
		CarDTO dto5 = new CarDTO("Chevrolet", 2000000, CarVariant.mid);
		carShowRoom.addCar(dto5);
		CarDTO dto6 = new CarDTO("Mercedes-Benz", 2500000, CarVariant.mid);
		carShowRoom.addCar(dto6);
		carShowRoom.displayCars();
		carShowRoom.UpdateCarVariant(CarVariant.mid, 2);
	carShowRoom.displayCars();
	carShowRoom.displayCarByBrand("BMW");
	carShowRoom.displayCarByBrand("rolls royce");
	carShowRoom.displayCarByBrand("Baleno");
		
	}

}
