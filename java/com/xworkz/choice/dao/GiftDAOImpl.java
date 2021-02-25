package com.xworkz.choice.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.xworkz.choice.dto.GiftDTO;

public class GiftDAOImpl implements GiftDAO {
	
	private List<GiftDTO> list;
	
	public GiftDAOImpl() {
		this.list= new ArrayList<GiftDTO>();
	}

	@Override
	public void save(GiftDTO dto) {
	System.out.println("invoked dto"+dto);
	this.list.add(dto);

	}

	@Override
	public Optional<GiftDTO> fetchBy(String name) {
		for (GiftDTO g : list) {
			Optional<String> givenBy = g.getGivenBy();
			if(givenBy.isPresent()) {
				String givenString = givenBy.get();
				if(givenString.equals(name)) {
					System.out.println("same name is given");
					return Optional.of(g);
				}
				
			}
			
		}return Optional.empty();
	}

}
