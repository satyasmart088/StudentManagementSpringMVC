package com.satya.sm.api;

public class Students {
	
	private int id;
	private String first_name;
	private String last_name;
	private long mobile;
	private String email;
	private String address;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", mobile=" + mobile
				+ ", email=" + email + ", address=" + address + "]";
	}
	
	

}
