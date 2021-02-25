package com.xworkz.choice.dto;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WonderDTO {
	private String name;
	private String place;
	private WonderType period;
	private Optional<String> OtherName;

	public enum WonderType {
		AD, BC
	}

	public WonderDTO() {

	}

	public WonderDTO(String name, String place, WonderType period) {
		this.name = name;
		this.place = place;
		this.period = period;

	}
}
