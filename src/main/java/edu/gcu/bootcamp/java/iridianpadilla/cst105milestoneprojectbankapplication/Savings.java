package edu.gcu.bootcamp.java.iridianpadilla.cst105milestoneprojectbankapplication;

public class Savings extends Account {
	// create attributes for a method
	private double serviceFee;
	private double annualInterestRate;
	private double minBalance;
	/**
	 * method will get attribute 
	 * @return variable 
	 */
	// get and set methods for attributes
	public double getServiceFee() {
		return serviceFee;
	}
	/**
	 * method will set attribute
	 * @param serviceFee will return value to variable
	 */
	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}
	/**
	 * method will get attribute
	 * @return variable
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	/**
	 * method will set attribute
	 * @param annualInterestRate will return value to variable
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	/**
	 * method will get attribute declared
	 * @return variable
	 */
	public double getMinBalance() {
		return minBalance;
	}
	/**
	 * method will set attribute
	 * @param minBalance will return value to variable
	 */
	// set value in main()
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	/**
	 * create constructor of class
	 * @param balance sets variable to a value
	 * @param account sets variable to a value
	 */
	// set value in main()
	public Savings(double balance, String account) {
		this.setBalance(balance);
		this.setAccount(account);
	}
}
