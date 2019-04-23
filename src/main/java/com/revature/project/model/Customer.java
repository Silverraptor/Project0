package com.revature.project.model;

public class Customer {
	private String firstName; //First name of customer, must be letters only
	private String lastName; //Last name of customer, must be letters only
	private String password; //Hashed and Salted password
	private String email; //Valid email address
	private String phoneNumber; //Valid phone number
	private String address1; //aprt. 2, 58 brownville road
	private String address2; //Broomall, PA
	private String zipCode; //Valid zip code
	
	public Customer(String firstName, String lastName, String password, String email, String phoneNumber,
			String address1, String address2, String zipCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address1 = address1;
		this.address2 = address2;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", address1=" + address1 + ", address2=" + address2
				+ ", zipCode=" + zipCode + "]";
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
