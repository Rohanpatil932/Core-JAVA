package com.xworkz.VTU;

import com.xworkz.VTU.constants.Branches;
/**
 * 
 * @author Rohan Patil
 *
 */

public class CSEngineer extends Engineer {

	public Branches branch=Branches.cs;
	
	@Override
	public void problemSolving() {
		super.problemSolving();
		System.out.println("solved by::"+Branches.cs);
	}
	public void coding() {
		System.out.println("invoked coding");
	}
	
	public Branches getBranches() {
		return branch;
	}
	public Branches getParentBranch() {
		return super.branches;
	}

}
