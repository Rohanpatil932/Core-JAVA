package com.xworkz.comsetics.service;

import com.xworkz.comsetics.constants.CosmeticShade;
import com.xworkz.comsetics.constants.CosmeticType;
import com.xworkz.comsetics.dto.CosmeticDTO;

public class ServiceImpl implements CosmeticService {

	public ServiceImpl() {
		System.out.println("created cosmetic service");
	}

	@Override
	public boolean ValidateAndsave(CosmeticDTO dto) {
		boolean validData = false;

		if (dto != null) {
			System.out.println("dto is not null add data");
			String brand = dto.getBrand();
			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is invalid");
				validData=false;
			}

			CosmeticType type = dto.getType();
			if (validData && type != null) {
				System.out.println("type is valid");
				validData = true;
			} else {
				System.out.println("type is invalid");
				validData=false;
			}

			double price = dto.getPrice();
			if (validData && price > 0) {
				System.out.println("price is valid");
				validData = true;
			} else {
				System.out.println("price is invalid");
				validData=false;
			}

			CosmeticShade shade = dto.getShades();
			if (validData && shade != null) {
				System.out.println("shade os valid");
				validData = true;
			} else {
				System.out.println("shade is invalid");
				validData=false;
			}

			int quantity = dto.getQuantity();
			if (validData && quantity > 0 && quantity <= 100) {
				System.out.println("quantity is valid");
				validData = true;
			} else {
				System.out.println("quantity is invalid");
				validData=false;
			}

		} else {
			System.out.println("enter valid data");
		}
		return false;

	}

}
