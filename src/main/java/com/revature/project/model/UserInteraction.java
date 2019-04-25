package com.revature.project.model;

import java.util.Scanner;

import javax.lang.model.element.VariableElement;

public class UserInteraction {

	
	/*main/java/com/revature/project/userinteraction

	Class InputController:
	Ask the user questions/login etc.

	Perhaps some other utility classes.*/
	
	private Scanner nacs = new Scanner(System.in);
	
	public void UserGreeting() {
		
		boolean Invalid = true;
		do {
			
			System.out.println("Welcome to Revature's Banking App!");
			System.out.println("Press '1' if you are a customer, '2' if you are an employee, or '3' if you are an admin:");
			
			int userInput = nacs.nextInt();
			
			switch (userInput) {
			case 1:
				//Goes to Customer Check Account UI
				
			case 2:
				//Goes to Employee Login UI
			case 3:
				//Goes to Admin Account UI
	
			default:
				System.out.println("Invalid Entry.");	
			}
			
			
		} while (Invalid == true);
	}
	
	public void CustomerCheckAccount() {
		
		boolean Invalid = true;
		do {
			
		
		System.out.println("Do you have an existing Account? (Type 'y' for yes. Type 'n' for no.");
		String userInput = nacs.nextLine();
		
		boolean ifYes = "y".equalsIgnoreCase(userInput);
		boolean ifNo = "n".equalsIgnoreCase(userInput);
		
		switch (userInput.toLowerCase()) {
		case "y":
			//Goes to CustomerLogin()
			
		case "n":
			//Goes to CustomerAccountCreation()

		default:
			System.out.println("Invalid Entry. Make sure to enter either 'y for yes and type 'n' for no.");
		}
		
		} while (Invalid == true);
	}
	
	public void CustomerAccountCreation() {
		//Uses Customer Class
	}
	
	public void CustomerLogin() {
		System.out.println("Please enter username:");
		String userInput = nacs.nextLine();
		System.out.println("Please enter password:");
		String userInput2 = nacs.nextLine();
		
		//Checks with existing username and password in database
		//If true, logs in
		//If false, outputs "Invalid username or password"
		//Asks user if he wants to attempt another login. If yes, goes to CustomerLogin(). If no, goes to UserGreeting().
	}
	
	public void EmployeeLogin() {
		System.out.println("Please enter username:");
		String userInput = nacs.nextLine();
		System.out.println("Please enter password:");
		String userInput2 = nacs.nextLine();
		
		//Checks with existing username and password in database
		//If true, logs in
		//If false, outputs "Invalid username or password
		//Asks user if he wants to attempt another login. If yes, goes to EmployeeLogin(). If no, goes to UserGreeting().
	}
	
	public void AdminLogin() {
		System.out.println("Please enter username:");
		String userInput = nacs.nextLine();
		System.out.println("Please enter password:");
		String userInput2 = nacs.nextLine();
		
		//Checks with existing username and password in database
		//If true, logs in
		//If false, outputs "Invalid username or password"
		//Asks user if he wants to attempt another login. If yes, goes to AdminLogin(). If no, goes to UserGreeting().
	}
	
	public void CustomerMenu() {
		System.out.println("Select '1' for Withdrawing funds. Select '2' for depositing funds. Select '3' for Joint Accounts menu.");
		String userInput = nacs.nextLine();
		//If user enters '1', program goes to WithdrawFunds() of that account
		//If user enters '2', program goes to DepositFunds() of that account
		//If user enters '3', program goes to JointAccountMenu() of that account
	}
	
	public void EmployeeMenu() {
		System.out.println("Press '1' for pending accounts. Press '2' to view a Customer's Account details.");
		String userInput = nacs.nextLine();
		//If Employee enters '1', takes employee to PendingAccounts() where they can approve and deny pending accounts
		//If Employee enters '2', takes employee to CustomerAccountInfo() where they can view a customer's different accounts.
	}
	
	public void AdminMenu() {
		System.out.println("Press '1' for pending accounts. Press '2' to view an Account status.");
		String userInput = nacs.nextLine();
		//If Admin enters '1', takes admin to PendingAccounts() where they can approve and deny pending accounts
		//If Admin enters '2', takes admin to AdminCustomerAccountInfo() where they can view a customer's different accounts and edit them.
	}
	
	public void PendingAccounts() {
		System.out.println("Current Pending Accounts:");
		//Displays list from database of accounts that needs to be approved or denied
		//Gives user ability to select an account and either Approve or Deny it
	}
	
	private void CustomerAccountInfo() {
		System.out.println("Please enter Account ID you wish to view:");
		String userInput = nacs.nextLine();
		//Displays Customer information
		//Gives Employee option to look through Customer's Account balances or the option to exit, which will send them to UserGreeting().
		
		//If no Account ID matches, will display:
		System.out.println("No Account exists with that ID!");
		//Asks the user if they want to continue or exit. Continue will send them to CustomerAccountInfo(). Exit will send them to UserGreeting()
	}
	
	private void AdminCustomerAccountInfo() {
		System.out.println("Please enter Account ID you wish to view:");
		String userInput = nacs.nextLine();
		//Displays Customer information
		//Gives Admin option to look through Customer's Account balances or the option to exit, which will send them to UserGreeting().
		//Gives Admin options from CustomerMenu()
		//Gives Admin option to 
		
		//If no Account ID matches, will display:
		System.out.println("No Account exists with that ID!");
		//Asks the user if they want to continue or exit. Continue will send them to AdminCustomerAccountInfo(). Exit will send them to UserGreeting()
	}
}
