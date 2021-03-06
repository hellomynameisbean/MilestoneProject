package edu.gcu.bootcamp.java.iridianpadilla.cst105milestoneprojectbankapplication;

import java.util.Scanner;

/**
 * The Bank class will have the main() to run method/funstions
 * @author bean
 *
 */
public class Bank {
	
	/**
	 * main method will run all other methods called
	 * @param args
	 */
	// main() method 
	public static void main(String[]args) {
		// create objects of classes and set parameters
	Bank bank = new Bank("GCU Credit Union");
	Savings savings = new Savings(5000.00, "12345678");
	Checking checking = new Checking(2500.00, "45676543");
	Loan loan = new Loan(10000.00, "9876543");
	Customer customer = new Customer("James","Bond");
	// set method values 
	checking.setOverDraft(45.00);
	savings.setServiceFee(25.00);
	savings.setAnnualInterestRate(.03);
	loan.setLateFee(25.00);
	loan.setInterestRate(.09);
	savings.setMinBalance(500.00);
	bank.displayMenu(checking, savings, loan);
//	bank.actionMenu(option, checking, savings);
//	bank.doEndMonth(checking, savings);
//	bank.displayExitScreen();
//	bank.displayBalanceScreen(checking, savings);
//	bank.displayWithdrawSavings(savings);
//	bank.displayWithdrawChecking(checking);
//	bank.displayDepositSavings(savings);
//	bank.displayDepositChecking(checking);
	}
	Scanner scanner = new Scanner(System.in);
	// create attributes for methods
	private String name;
	
	/**
	 * method will set attribute 
	 * @param name will return value name
	 */
	// create object for class to name the bank
	public Bank(String name) {
		this.name = (name);
	}
	
	// create method display menu
	// create switch statement to display all options available to user from bank account
	private void displayMenu(Checking checking, Savings savings, Loan loan) {
		int option;
		do {
			System.out.println("===================================");
			System.out.println("             MAIN MENU");
			System.out.println("           "+ this.name.toUpperCase());
			System.out.println("===================================");
			System.out.println("Pick an option: ");
			System.out.println("---------------------");
			System.out.println(" 1: : Deposit to Checking");
			System.out.println(" 2: : Deposit to Savings");
			System.out.println(" 3: : Write a Check");
			System.out.println(" 4: : Withdraw from Savings");
			System.out.println(" 5: : Get balance");
			System.out.println(" 6: : Make a Payment to Loan Balance");
			System.out.println(" 7: : Close month");
			System.out.println("---------------------");
			System.out.println(" 9: : Exit");
			option = scanner.nextInt();
			this.actionMenu(option, checking, savings, loan);
		}while (option !=9);
	}
	
	// create method action menu 
	// create a if else if statements to display actions that are available to be taken 
	// from bank account account
	void actionMenu(int option, Checking checking, Savings savings, Loan loan) {
		if (option == 1){
			this.displayDepositChecking(checking);
		}else if
			(option == 2) {
			this.displayDepositSavings(savings);
		}else if 
			(option == 3) {
			this.displayWithdrawChecking(checking);
		}else if
			(option == 4) {
			this.displayWithdrawSavings(savings);
		}else if
			(option == 5) {
			this.displayBalanceScreen(checking, savings);
		}else if
			(option == 6) {
			this.makePayment(loan);
		}else if
			(option == 7) {
			this.doEndMonth(checking, savings, loan);
		}else if
			(option == 9) {
			this.displayExitScreen();
		}else 
			System.out.println("Wrong Entry");
	}
	// create method do end month
	// create a switch case statement to display do end month from checking or savings account
	private void doEndMonth(Checking checking, Savings savings, Loan loan) {
		// display new balance with fee
		System.out.printf("Here is your end of month balance: $%.2f\n",checking.getBalance());
		//checking.setOverDraft(overDraft));
		if(savings.getBalance()>savings.getMinBalance()) {
			savings.setBalance(savings.getBalance()+(savings.getBalance()*savings.getAnnualInterestRate()/12));
		}else {
			savings.setBalance(savings.getBalance()+savings.getServiceFee());
			}
		System.out.printf("Here is your end of month balance for your savings account: $%.2f\n"
			,savings.getBalance());;
		if(loan.getPaymentMade()>0) {
			loan.setBalance(loan.getBalance()+(loan.getBalance()*loan.getInterestRate()/12));
		}else {
			loan.setBalance(loan.getBalance()+(loan.getBalance()*loan.getInterestRate()/12)+loan.getLateFee());
		}
		System.out.printf("Here is your end of month balance for your loan account: $%.2f\n"
					,loan.getBalance());
		
	}
	// create method display exit screen 
	// prompt user if done with transaction or if will continue with a different transaction
	private void displayExitScreen() {
		System.out.println("Have a good day");
	}
	// create method display balance screen
	// create a switch case statement to display balance from checking or savings account
	private void displayBalanceScreen(Checking checking, Savings savings) {
		System.out.println("This is your Checking Account Balance: "+ checking.getBalance());
		System.out.println("This is Savings Account Balance: "+ savings.getBalance());
		scanner.nextLine();
	}
	// create method display withdraw savings
	// create a switch case statement to display amount withdrawn from savings account
	private void displayWithdrawSavings(Savings savings) {
		double value;
		System.out.println("This is your savings account balance: "+ savings.getBalance() 
				+" How much would you like to withdraw");
		value = scanner.nextDouble();
		savings.setBalance(savings.getBalance()-value);
		System.out.println("Here is your new savings account balance"+ savings.getBalance());
	}
	// create method display withdraw checking
	// create a switch case statement to display amount withdrawn from checking account
	private void displayWithdrawChecking(Checking checking) {
		double value;
		System.out.println("How much would like to with draw from your "
				+ "checking account balance: "+ checking.getBalance());
		value = scanner.nextDouble();
		if(value >checking.getBalance()) {
			checking.setBalance(checking.getBalance()-value-checking.getOverDraft());
		}else {
			checking.setBalance(checking.getBalance()-value);
		}
		System.out.println("Here is your new balance: "+ checking.getBalance());
	}
	// create method display deposit savings
	// create a switch case statement to display amount deposited from savings account
	private void displayDepositSavings(Savings savings) {
		double value;
		System.out.println("How much would you like to deposit into your savings?");
		value = scanner.nextDouble();
		savings.setBalance(savings.getBalance()+value);
		System.out.println("Here is your new balance: "+ savings.getBalance());
	}
	// create method display deposit checking
	// create a switch case statement to display amount deposited from checking account
	private void displayDepositChecking(Checking checking) {
		double value;
		System.out.println("How much would you like to deposit into your checking?");
		value = scanner.nextDouble();
		checking.setBalance(checking.getBalance()+value);
		System.out.println("Here is your new balance: "+ checking.getBalance());
	}
	public void makePayment(Loan loan) {
		double value;
		System.out.println("How much would you like to pay for your loan?");
		value = scanner.nextDouble();
		loan.setBalance(loan.getBalance()-value);
		System.out.println("Thank you for your payment here is your new balance: "+loan.getBalance());
		}
}
