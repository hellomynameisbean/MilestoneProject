package edu.gcu.bootcamp.java.iridianpadilla.cst105milestoneprojectbankapplication;

import org.junit.Test;

public class Account {
	// create attributes for a method
	private double balance;
	private String account;
	/** 
	 * method will get attribute
	 * @return variable
	 */
	 // create get and set methods for attributes
	public double getBalance() {
		return balance;
	}
	/**
	 * method will set attribute 
	 * @param balance variable set to value
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * method will get attribute
	 * @return variable
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * method will set attribute
	 * @param account variable set to value
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * create method to withdraw from checking or savings as variables
	 * @param amountWithdrawn set balance to amount withdrawn value
	 * @return
	 */
	// create method to withdraw from checking or savings account
	public double doWithdraw(double amountWithdrawn) {
		
		this.balance = amountWithdrawn;
		return balance;
	}
	/**
	 * create deposit method to deposit into checking or savings
	 * @param amountDeposited set balance to amount deposited value
	 * @return
	 */
	// create method to deposit into checking and savings account
	public double doDeposit(double amountDeposited) {
		this.balance = amountDeposited;
		return balance;
	}
}
