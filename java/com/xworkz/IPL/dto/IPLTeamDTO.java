package com.xworkz.IPL.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class IPLTeamDTO {

	private String name;
	private String homeGround;
	private int rating;
	private jercyColor jercyColor;
	private String OwnBy;
	
	public enum jercyColor{
		BLUE, YELLOW ,RED, ORANGE
	}
	
}
