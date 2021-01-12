package com.xworkz.places;

import com.xworkz.places.dto.PalaceDTO;

public class palaceTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		String location = "mysore";
		String kingName = "Yaduveer Krishnadatta Chamaraja";
		String queenName = "Trishikha Kumari Wadiyar";

		PalaceDTO dto = new PalaceDTO();
		dto.setKingName(kingName);
		dto.setLocation(location);
		dto.setQueenName(queenName);

		PalaceDTO cloned = dto.clone();
		System.out.println(cloned.getKingName());
		System.out.println(cloned.getLocation());
		System.out.println(cloned.getQueenName());

	}

}

