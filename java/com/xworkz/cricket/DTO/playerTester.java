package com.xworkz.cricket.DTO;

public class playerTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		String name = "Rohit Sharma";
		int jersyNo = 0;
		String sport = "Cricket";
		
		PlayerDTO dto = new PlayerDTO();
		dto.setJersyNo(jersyNo);
		dto.setName(name);
		dto.setSport(sport);
		System.out.println(dto.getJersyNo());
		System.out.println(dto.getName());
		System.out.println(dto.getSport());
		System.out.println(dto.equals(dto));
		
		PlayerDTO clone=dto.clone();
		System.out.println(clone.getJersyNo());
		System.out.println(clone.getSport());
		System.out.println(clone.equals(dto));
		

	}

}
