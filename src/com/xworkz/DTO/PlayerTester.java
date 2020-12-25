package com.xworkz.DTO;

import java.util.Arrays;

public class PlayerTester {
	public static void main(String[] args) {
		PlayerDTO player=new PlayerDTO();
		player.setName("Sachin");
		System.out.println(player.getName());
		player.setCountry("INDIA");
		System.out.println(player.getCountry());
		player.setSports(new String[] {"cricket","golf","tennis","dumb charades"});
		 System.out.println(Arrays.toString(player.getSports()));
		 player.setAwards(new String[] {"Arjuna Award"," Rajiv Gandhi Khel Ratna","Padma Shri","Padma Vibhushan"});
		 System.out.println(Arrays.toString(player.getAwards()));
		 
		 PlayerDTO player2=new PlayerDTO();
		 player.setName("saina nehwal");
			System.out.println(player.getName());
			player.setCountry("INDIA");
			System.out.println(player.getCountry());
			player.setSports(new String[] {"badminton","golf","carrom"});
			 System.out.println(Arrays.toString(player.getSports()));
			 player.setAwards(new String[] { "Badminton World Federation","Arjuna Award", "Padma Shri","Rajiv Gandhi Khel Ratna","Padma Bhushan"});
			 System.out.println(Arrays.toString(player.getAwards()));

			 PlayerDTO player3=new PlayerDTO();
			 player.setName("sania mirza");
				System.out.println(player.getName());
				player.setCountry("INDIA");
				System.out.println(player.getCountry());
				player.setSports(new String[] {"tennis","chess"} );
				 System.out.println(Arrays.toString(player.getSports())); 
				 player.setAwards(new String[] {"Arjuna Award"," Rajiv Gandhi Khel Ratna","Padma Shri","Padma Vibhushan"});
				 System.out.println(Arrays.toString(player.getAwards()));
				 
				 PlayerDTO player4=new PlayerDTO();
				 player.setName("Viswanathan Anand");
					System.out.println(player.getName());
					player.setCountry("INDIA");
					System.out.println(player.getCountry());
					player.setSports(new String[] {"golf","carrom","chess"});
					 System.out.println(Arrays.toString(player.getSports())); 
					 player.setAwards(new String[] {"chess oscar"," Rajiv Gandhi Khel Ratna","Padma Shri"});
					 System.out.println(Arrays.toString(player.getAwards()));
	}

}
