package com.phonebok1;

public class Person {

	
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	private Address address = new Address ();
	
	public Person(String firstName, String middleName, String lastName, String phoneNumber, Address address) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	
		
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return  firstName + " " + middleName + " " + lastName + ", "
				+ phoneNumber + " " + address;
	}
	
	
	
	
	
	
}
