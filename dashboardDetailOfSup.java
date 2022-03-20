package com.Phoenixpojo;

public class dashboardDetailOfSup {

	
	private String pending_for_assignment;

	public dashboardDetailOfSup(String pending_for_assignment) {
		super();
		this.pending_for_assignment = pending_for_assignment;
	}

	public String getPending_for_assignment() {
		return pending_for_assignment;
	}

	public void setPending_for_assignment(String pending_for_assignment) {
		this.pending_for_assignment = pending_for_assignment;
	}

	@Override
	public String toString() {
		return "dashboardDetailOfSup [pending_for_assignment=" + pending_for_assignment
				+ ", getPending_for_assignment()=" + getPending_for_assignment() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
