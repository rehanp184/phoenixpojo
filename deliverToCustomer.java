package com.Phoenixpojo;

public class deliverToCustomer {

	private String Jb_ID;

	public deliverToCustomer(String jb_ID) {
		super();
		Jb_ID = jb_ID;
	}

	public String getJb_ID() {
		return Jb_ID;
	}

	public void setJb_ID(String jb_ID) {
		Jb_ID = jb_ID;
	}

	@Override
	public String toString() {
		return "deliverToCustomer [Jb_ID=" + Jb_ID + ", getJb_ID()=" + getJb_ID() + "]";
	}
	
	
	
	
}


