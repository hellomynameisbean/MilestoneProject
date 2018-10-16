package edu.gcu.bootcamp.java.iridianpadilla.cst105milestoneprojectbankapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transaction {
	//Calendar calendar = new Calendar();
	List <String[]> transaction = new ArrayList<String[]>();
	// 
	public String displayTransactionLog() {
		return null;
	}
	
	public String displayAutoEndOfMonth() {
		return null;
	}
	
	public void displayTransactionArray() {
		System.out.println(Arrays.deepToString(transaction.toArray()));
	}
}
