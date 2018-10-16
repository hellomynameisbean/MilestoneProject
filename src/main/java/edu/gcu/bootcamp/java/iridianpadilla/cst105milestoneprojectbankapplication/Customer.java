package edu.gcu.bootcamp.java.iridianpadilla.cst105milestoneprojectbankapplication;

import java.util.Date;
/**
 * create public class customer to house attributes for our banking customer
 */
public class Customer {
	// create attributes of a customer and provide data types
	private String firstName;
	private String lastName;
	Date dateOpened;
	/**
	 * create method to get attribute info 
	 * @return info retrieved from attribute
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * create method to set info retrieved from attribute
	 * @param  set attribute firstName to value pulled from set attribute 
	 */
	public void setFirstName(String firstName) {
		this.firstName= firstName;
	}
	/** 
	 * create method to get attribute info
	 * @return info retrieved form attribute
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * create method to set attribute info 
	 * @param set attribute lastName to value pulled from set attribute
	 */
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	/**
	 * create constructor of Customer class provide parameters and data types that will be passed in
	 * @param set firstName to value of first name
	 * @param set lastName to value of last name 
	 */
	public Customer(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
}
