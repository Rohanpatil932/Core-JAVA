package com.xworkz.comsetics;

import com.xworkz.comsetics.constants.CosmeticShade;
import com.xworkz.comsetics.constants.CosmeticType;
import com.xworkz.comsetics.dto.CosmeticDTO;
import com.xworkz.comsetics.service.ServiceImpl;

public class ServiceTester {

	public static void main(String[] args) {

		ServiceImpl impl = new ServiceImpl();

		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("Nykaa");
		cosmeticDTO.setPrice(200);
		cosmeticDTO.setQuantity(2000);
		cosmeticDTO.setShades(CosmeticShade.GREEN);
		cosmeticDTO.setType(CosmeticType.MASCARA);

		impl.ValidateAndsave(cosmeticDTO);
	}

}
