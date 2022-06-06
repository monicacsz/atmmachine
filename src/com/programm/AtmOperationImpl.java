package com.programm;

public class AtmOperationImpl implements AtmOperationInterf {

	ATM atm = new ATM();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is: " + atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println(depositAmount + "Deposit Successfully! ");
		atm.setBalance(atm.getBalance() + depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		
	}

}
