package com.xworkz.places;

import com.xworkz.places.dto.ZooDTO;

public class ZooTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		ZooDTO dto = new ZooDTO();
		dto.setEntryFees(200l);
		dto.setName("mysoreZoo");
		dto.setNoOfAnimals(10000);
		dto.setOpen(true);
		dto.setSafari(true);
		
		ZooDTO cloned=dto.clone();
		System.out.println(cloned.getEntryFees());
		System.out.println(cloned.getName());
		System.out.println(cloned.getNoOfAnimals());
		System.out.println(cloned.isOpen());
		System.out.println(cloned.isSafari());
		System.out.println(cloned.hashCode());
		System.out.println(cloned.equals(dto));

	}

}
