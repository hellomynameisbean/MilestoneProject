package edu.gcu.bootcamp.java.iridianpadilla.cst105milestoneprojectbankapplication;

public class Checking extends Account{
	// create attributes for a method
	private double overDraft;
	/**
	 * method will get attribute
	 * @return variable
	 */
	// create get and set methods for attributes
	public double getOverDraft() {
		return overDraft;
	}
	/**
	 * method will set attribute
	 * @param overDraft sets variable to a value
	 */
	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
	/**
	 * create constructor of class
	 * @param balance set variable to a value
	 * @param account set variable to a value
	 */
	// set values in main()
	public Checking(double balance, String account) {
		this.setBalance(balance);
		this.setAccount(account);
	}
	
}
