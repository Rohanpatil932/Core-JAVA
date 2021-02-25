package com.xworkz.choice;

import java.util.Optional;

import com.xworkz.choice.dao.GiftDAO;
import com.xworkz.choice.dao.GiftDAOImpl;
import com.xworkz.choice.dto.GiftDTO;
import com.xworkz.choice.dto.GiftDTO.GiftType;

public class GiftTester1 {

	public static void main(String[] args) {
		GiftDAO dao = new GiftDAOImpl();

		GiftDTO dto = new GiftDTO();
		dto.setType(Optional.of(GiftType.CHOCOLATE));
		dto.setGivenBy(Optional.of("rakesh"));
		dto.setPrice(40);

		dao.save(dto);
		Optional<GiftDTO> fetchBy = dao.fetchBy("rakesh");
		fetchBy.ifPresent(v -> System.out.println(v));
	}

}
