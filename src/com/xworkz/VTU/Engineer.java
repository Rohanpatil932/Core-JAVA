package com.xworkz.VTU;

import com.xworkz.VTU.constants.Branches;

public class Engineer {
	private String USN;
	public Branches branches = Branches.mech;

	public void problemSolving() {
		System.out.println("invoked provlem solving");
		System.out.println("solved by::" + this.branches);
	}
public void bunking() {
	System.out.println("Already Bunked classes");
}
public String getUSN() {
	return USN;
}
public void setUSN(String uSN) {
	USN = uSN;
}
}
