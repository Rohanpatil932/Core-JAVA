package com.xworkz.choice;

import java.util.Optional;

import com.xworkz.choice.dto.WonderDTO;
import com.xworkz.choice.dto.WonderDTO.WonderType;

public class OptionalWonderTester {

	public static void main(String[] args) {
		WonderDTO dto = new WonderDTO();
		dto.setName("Christ");
		dto.setPeriod(WonderType.BC);
		dto.setPlace("brazil");
		dto.setOtherName(Optional.of("Statue"));

		String upperCase = dto.getName().toUpperCase();
		System.out.println(upperCase);
		System.out.println(dto);

		Optional<String> otherName = dto.getOtherName();
		System.out.println(otherName.isPresent());
		otherName.ifPresent(v -> System.out.println(v));

		otherName.filter(c -> c.contains("t")).ifPresent(c -> System.out.println("found t"));

		otherName.map(c -> c.toLowerCase()).ifPresent(c -> System.out.println(c + "::lowercase"));

		String string = otherName.map(c -> "String").get();
		System.out.println(string);

		Integer integer = otherName.flatMap(c -> Optional.of(30)).get();///flatmap can convert any value to any datatype unlike map
		System.out.println(integer);

	}

}
