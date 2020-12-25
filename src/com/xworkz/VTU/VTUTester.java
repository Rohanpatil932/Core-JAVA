package com.xworkz.VTU;

import com.xworkz.VTU.constants.CivileEngineer;

public class VTUTester {
	public static void main(String[] args) {
		Engineer engineer = new Engineer();
		engineer.setUSN("4bb14me029");
		System.out.println(engineer.getUSN());
		engineer.problemSolving();

		CSEngineer csEngineer = new CSEngineer();
		csEngineer.problemSolving();
		csEngineer.setUSN("4bb16cs023");
		System.out.println(csEngineer.getUSN());
		System.out.println("parent branch::"+csEngineer.getParentBranch());
		
		Engineer engineer2=new CSEngineer();
		CSEngineer  csEngineer2=(CSEngineer)engineer2;
		engineer2.problemSolving();
		System.out.println(csEngineer2.getBranches());
		
		Engineer engineer3=new  CivileEngineer();
		CivileEngineer civileEngineer=(CivileEngineer)engineer3;
		System.out.println(civileEngineer.getBranch());
		civileEngineer.problemSolving();
		civileEngineer.creatingBuilding();
		
	}
}

