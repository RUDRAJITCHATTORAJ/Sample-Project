package com.cognizant.MovieTicket.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Customer {

	@NotBlank(message = "Plz fill you name")   
	@Size(min=3,max=20)
	private String name;
	
	@NotBlank
	@Size(min = 4,max = 8)
	private String password;
	
	@NotBlank
	private String gender;
	
//	@AssertTrue
//	private String hobbies;
	
	
	private String locationlist;
	
	public String getLocationlist() {
		return locationlist;
	}
	public void setLocationlist(String locationlist) {
		this.locationlist = locationlist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
//	public String getHobbies() {
//		return hobbies;
//	}
//	public void setHobbies(String hobbies) {
//		this.hobbies = hobbies;
//	}
//	
	
	
}
