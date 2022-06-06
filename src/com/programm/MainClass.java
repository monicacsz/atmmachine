package com.programm;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		AtmOperationInterf op = new AtmOperationImpl();
		int atmNumber = 301769;
		int atmPin = 3020;
		
		Scanner keyboardInput = new Scanner(System.in);
		
			System.out.println("Welcome to ATM Machine! ");
			System.out.println("Enter your credentials: ");
			int atmNumber1 = keyboardInput.nextInt();
			System.out.println("Enter your pin: ");
			int atmPin1 = keyboardInput.nextInt();
			
			if(atmNumber1 == atmNumber1 && atmPin1 == atmPin1) {
				while(true) {
					System.out.println("1. Check Available Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Mini Statement\n5. Exit");
					System.out.println("Enter your choice: ");
					int choice = keyboardInput.nextInt();
					if(choice == 1) {
						op.viewBalance();
						
					}
					else if(choice == 2) {
						System.out.println("Enter amount to withdraw: ");
						double withdrawAmount = keyboardInput.nextDouble();
						op.withdrawAmount(withdrawAmount);
						
					}
					else if(choice == 3) {
						System.out.println("Enter amount to deposit");
						double depositAmount = keyboardInput.nextDouble();
						op.depositAmount(depositAmount);
						
					}
					else if(choice == 4) {
						op.viewMiniStatement();
						
					}
					else if(choice == 5) {
						System.out.println("Collect your ATM Card\n Thank you for using our services!");
						System.exit(0);
						
					}
					else {
						System.out.println("Please enter a valid choice.");
					}
					
				}
				
			}
			else {
				System.out.println("Incorrect credentials and/or pin.");
				System.exit(0);
			}
			
		
			
		
	}

}
