package com.itccloud.mwccdc.controller;

//Using the same exact personObject that we used in HW#2, with the same variable names


public class personObject {

	
	public personObject(String firstName, String lastName, String gender, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
	}
	
	
	
	private String firstName;
	private String lastName;
	private String gender;
	private String address;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//I like how this object is re-usable, this makes learning a new language or a new way to code much more approachable and learnable for me
	
	
	@Override
	public String toString() {
		return "personObject [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", address="
				+ address + "]";
	}
	
	
	
	
	
}

