package edu.gcu.bootcamp.java.iridianpadilla.cst105milestoneprojectbankapplication;
/**
 * create abstract class Loan that extends/inherits from class Account
 */
public class Loan extends Account{
	// create attributes of a Loan class
	private double interestRate;
	private double lateFee;
	private double loanLateFee;
	private double paymentMade;
	/**
	 * create method to get attribute info
	 * @return the value retrieved from attribute
	 */
	public double getInterestRate() {
		return interestRate;
	}
	/**
	 * create method to get the value retrieved from attribute 
	 * @param set interestRate to value from attribute
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	/**
	 * create method to get attribute info passed in 
	 * @return the value retrieved from attribute
	 */
	public double getLateFee() {
		return lateFee;
	}
	/**
	 * create method to get the value retrieved from attribute 
	 * @param set lateFee to value retrieved from attribute
	 */
	public void setLateFee(double lateFee) {
		this.lateFee = lateFee;
	}
	/**
	 * create method to get attribute info passed 
	 * @return the value retrieved from attribute
	 */
	public double getLoanLateFee() {
		return loanLateFee;
	}
	/**
	 * create method to get the value retrieved from attribute 
	 * @param set loanLateFee to value retrieved from attribute
	 */
	public void setLoanLateFee(double loanLateFee) {
		this.loanLateFee=loanLateFee;
	}
	/**
	 * create method to get attribute info passed in
	 * @return the value retrieved from attribute
	 */
	public double getPaymentMade() {
		return paymentMade;
	}
	/**
	 * create method to get the value retrieved from the attribute
	 * @param set loanInterestRate to value retrieved from attribute
	 */
	public void setPaymentMade(double paymentMade) {
		this.paymentMade=paymentMade;
	}
	/**
	 * create constructor of Loan class provide parameters and data types to be passed in
	 * @param set balance to value of balance
	 * @param set account to value of account
	 */
	public Loan(double balance, String account) {
		this.setBalance(balance);
		this.setAccount(account);
	}
}
