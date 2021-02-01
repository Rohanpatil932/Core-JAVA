package com.xworkz.comsetics;

import com.xworkz.comsetics.constants.CosmeticShade;
import com.xworkz.comsetics.constants.CosmeticType;
import com.xworkz.comsetics.dao.CosmeticDAO;
import com.xworkz.comsetics.dao.CosmeticDAOImpl;
import com.xworkz.comsetics.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {

		CosmeticDTO dto=new CosmeticDTO("NYKAA", CosmeticShade.BLACK, CosmeticType.EYELINER, 600, 2);
		System.out.println(dto);
		
		CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
		cosmeticDAO.save(dto);
		
		CosmeticDTO search=cosmeticDAO.FindByBrand("NYKAA");
		System.out.println(search);
		
		boolean updated=cosmeticDAO.updatePriceAndQuantityByBrand(900, 5, "NYKAA");
		System.out.println(updated);
		
		System.out.println(dto);
		
		cosmeticDAO.updateTypeByBrand(CosmeticType.MASCARA, "NYKAA");
		
		System.out.println(dto);
		
		cosmeticDAO.deleteByBrand("NYKAA");
	}
	

}
