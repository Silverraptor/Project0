package com.revature.project;

import com.revature.project.model.Account;
import com.revature.project.model.AccountType;
import com.revature.project.model.Customer;
import com.revature.project.model.Transaction;

import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
        Customer customer = new Customer("John", "Doe", "password", "john@email.com", "800-123-4567", "1250 Second Street", "Hoodlum TX", "20053");
        
        Account account = new Account(customer, "000001", 0, AccountType.CHECKING);
        
        System.out.println();
        System.out.println();
    }
    

   
}
