package com.demo.model;

//import javax.validation.constraints.*;

public class Account {
	

	private String FirstName;

	private String LastName;

	private String Address;

	private String Email;

	private int Age=15;
	public int getAge() 
	{
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
}
