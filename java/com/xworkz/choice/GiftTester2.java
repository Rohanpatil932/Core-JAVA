package com.xworkz.choice;

import java.util.Optional;

import com.xworkz.choice.dto.GiftDTO;
import com.xworkz.choice.dto.GiftDTO.GiftType;

public class GiftTester2 {

	public static void main(String[] args) {
		GiftDTO dto = new GiftDTO();
		dto.setType(Optional.ofNullable(GiftType.NOTHING));
		Optional<GiftType> type = dto.getType();
		type.ifPresent(f -> System.out.println(f));

	}

}
