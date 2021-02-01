package com.xworkz.comsetics.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.comsetics.constants.CosmeticType;
import com.xworkz.comsetics.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	private List<CosmeticDTO> cosmetic;

	public CosmeticDAOImpl() {
		this.cosmetic = new ArrayList<>();

	}

	@Override
	public boolean save(CosmeticDTO dto) {
		System.out.println("invoked save");
		boolean added = this.cosmetic.add(dto);
		if (added)
			System.out.println("cosmetic added");
		else
			System.out.println("not added cosmetics");
		return added;

	}

	@Override
	public CosmeticDTO FindByBrand(String brand) {
		System.out.println("brand" + brand);
		for (CosmeticDTO cosmeticDTO : this.cosmetic) {
			String get = cosmeticDTO.getBrand();
			if (get.equals(brand)) {
				System.out.println("brand found");
				return cosmeticDTO;
			} else {
				System.out.println("brand not found");
			}
		}
		return null;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("updating price and quantity");
		System.out.println("price" + price);
		System.out.println("quantity" + quantity);
		CosmeticDTO find = this.FindByBrand(brand);
		if (find != null) {
			System.out.println("updating price and quantity");
			find.setPrice(price);
			find.setQuantity(quantity);
			return true;

		} else {
			System.out.println("cant update");
		}

		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		System.out.println("updating price by brand and type");
		System.out.println("price" + price);
		System.out.println("brand" + brand);
		System.out.println("type" + type);

		return false;
	}

	@Override
	public boolean updateTypeByBrand(CosmeticType type, String brand) {
		System.out.println("updating type by brand");
		System.out.println("type" + type);
		CosmeticDTO findbrand = this.FindByBrand(brand);
		if (findbrand != null) {
			System.out.println("updating type");
			findbrand.setType(type);
			return true;

		}
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		System.out.println("deleting bu brand");
		System.out.println("brand " + brand);
		Iterator<CosmeticDTO> iterator = this.cosmetic.iterator();
		while (iterator.hasNext()) {
			CosmeticDTO dto = iterator.next();
			if (dto.getBrand().equals(brand)) {
				iterator.remove();
				System.out.println("removed brand" + dto);
				return true;
			} else {
				System.out.println("location cant be deleted");
			}
		}

		return false;
	}

}
