package com.xworkz.VTU.constants;

import com.xworkz.VTU.Engineer;

public class CivileEngineer extends Engineer {
	public Branches branch = Branches.civil;

	public void problemSolving() {
		super.problemSolving();
		System.out.println("solved by::civil");

	}

	public final void creatingBuilding() {
		System.out.println("building created");
	}

	public Branches getBranch() {
		return branch;
	}
	

	public Branches getParentBranch() {
		return super.branches;
	}
}
