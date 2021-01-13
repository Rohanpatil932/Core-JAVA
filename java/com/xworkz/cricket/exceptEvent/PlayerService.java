package com.xworkz.cricket.exceptEvent;

import com.xworkz.cricket.DTO.PlayerDTO;

public class PlayerService {
	
public void showDetails(PlayerDTO dto) {
	String name = null;
	int jersyNo = 0;
	String sport = null;
	int[] a= {1};
	
	
	try {
	name=dto.getName();
	jersyNo=dto.getJersyNo();
	sport=dto.getSport();
	System.out.println(a[2]);
	}
	catch(ArrayIndexOutOfBoundsException | NullPointerException e ) {
		System.out.println("ArrayIndexOutOfBoundsException or NullPointerException catched");
	}
	System.out.println(name);
	System.out.println(jersyNo);
	System.out.println(sport);
	
}
}