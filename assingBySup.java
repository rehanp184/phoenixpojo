package com.Phoenixpojo;

public class assingBySup {

	private String job_id;
	private String engineer_id;
	
	public assingBySup(String job_id, String engineer_id) {
		super();
		this.job_id = job_id;
		this.engineer_id = engineer_id;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public String getEngineer_id() {
		return engineer_id;
	}

	public void setEngineer_id(String engineer_id) {
		this.engineer_id = engineer_id;
	}

	@Override
	public String toString() {
		return "assingBySup [job_id=" + job_id + ", engineer_id=" + engineer_id + ", getJob_id()=" + getJob_id()
				+ ", getEngineer_id()=" + getEngineer_id() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
