package com.xworkz.solution.dto;

import java.util.ArrayList;
import java.util.List;

public class AlcoholTester {

	public static void main(String[] args) {

		AlcoholDTO alcoholDTO1 = new AlcoholDTO("IB", "imperial blue", 40);

		AlcoholDTO alcoholDTO2 = new AlcoholDTO("old monk", "monk", 32);

		AlcoholDTO alcoholDTO3 = new AlcoholDTO("KF", "kingfisher", 40);

		AlcoholDTO alcoholDTO4 = new AlcoholDTO("magical moments", "vodka", 38);

		AlcoholDTO alcoholDTO5 = new AlcoholDTO("Dr.Brandy", "Brandy", 38);

		List<AlcoholDTO> alcoholDTOs = new ArrayList<AlcoholDTO>();

		alcoholDTOs.add(alcoholDTO1);
		alcoholDTOs.add(1, alcoholDTO2);
		alcoholDTOs.add(alcoholDTO3);
		alcoholDTOs.add(alcoholDTO4);
		alcoholDTOs.add(4, alcoholDTO5);

		System.out.println(alcoholDTOs);
		System.out.println(alcoholDTOs.size());

		int index = alcoholDTOs.indexOf(alcoholDTO4);
		System.out.println("index"+index);

		int last = alcoholDTOs.lastIndexOf(alcoholDTO5);
		System.out.println("lastIndex"+last);
		
		for (AlcoholDTO alcoholDTO : alcoholDTOs) {
			System.out.println(alcoholDTO);

		}

	}

}
