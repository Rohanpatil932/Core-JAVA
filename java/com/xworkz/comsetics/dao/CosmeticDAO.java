package com.xworkz.comsetics.dao;

import com.xworkz.comsetics.constants.CosmeticType;
import com.xworkz.comsetics.dto.CosmeticDTO;

public interface CosmeticDAO {

	boolean save(CosmeticDTO dto);
	
	CosmeticDTO FindByBrand(String brand);
	
	boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand);
	
	boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type);
	
	boolean updateTypeByBrand(CosmeticType type, String brand);
	
	boolean deleteByBrand(String brand);
	
}
	

