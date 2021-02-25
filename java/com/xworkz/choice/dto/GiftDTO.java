package com.xworkz.choice.dto;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GiftDTO {
	private Optional<GiftType> type;
	private Optional<String> givenBy;
	private double price;
	
	
	public enum GiftType{
		CHOCOLATE,TEDDY,MUG,DRESS,NOTHING
	}
}

