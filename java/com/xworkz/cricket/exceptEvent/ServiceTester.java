package com.xworkz.cricket.exceptEvent;

import com.xworkz.cricket.DTO.PlayerDTO;

public class ServiceTester {

	public static void main(String[] args) {
		
		PlayerService playerService = new PlayerService();
		
		PlayerDTO dto = new PlayerDTO();
		
		playerService.showDetails(null);
		
		
				
	}

}
