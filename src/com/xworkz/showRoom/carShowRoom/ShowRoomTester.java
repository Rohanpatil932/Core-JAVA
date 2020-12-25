package com.xworkz.showRoom.carShowRoom;
import com.xworkz.showRoom.carShowRoom.CarShowRoom;

import com.xworkz.showRoom.DTO.ManagerDTO;

public class ShowRoomTester {
	

		public static void main(String[] args) {
			CarShowRoom carShowRoom=new CarShowRoom();
			carShowRoom.addManager("Nisha", 98087651l);
			carShowRoom.displayManager();
			carShowRoom.removeManager();
			carShowRoom.displayManager();

			ManagerDTO dto=new ManagerDTO("Sneha", 75126l);
			carShowRoom.addManager(dto);
			carShowRoom.displayManager();
			carShowRoom.updateManager(7829731400l);
			carShowRoom.updateManager("Deepika");
			carShowRoom.displayManager();
		}

	}

