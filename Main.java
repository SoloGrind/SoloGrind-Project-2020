package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount start = new BankAccount("Angelo Rodriguez", "022301");
        start.showMenu();


    }
}

class BankAccount {

    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {

        if (amount > 0) ;
        balance = balance + amount;
        previousTransaction = amount;
    }

    void withdraw(int amount) {
        if (amount != 0) ;
        balance = balance - amount;
        previousTransaction = -amount;
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occured.");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. PreviousTransaction");
        System.out.println("E. Exit");
        do {
            System.out.print("=========================================================================================================");
            System.out.print("\n");
            System.out.println("Enter an option A. [CHECK BALANCE] B. [DEPOSIT] C. [WITHDRAW] D. [PREVIOUS TRANSACTION] E. [EXIT]");
            System.out.println("=========================================================================================================");
            option = input.next().charAt(0);
            System.out.println("\n");

             switch(option) {
                 case ('A'):
                     System.out.println("=========================================================================================================");
                     System.out.println("Balance = " + balance);
                     System.out.println("=========================================================================================================");
                     System.out.println("\n");
                     break;
                 case ('B'):
                     System.out.println("=========================================================================================================");
                     System.out.println("Enter any amount to deposit: ");
                     System.out.println("=========================================================================================================");
                     int amount = input.nextInt();
                     deposit(amount);
                     System.out.println("\n");
                     break;

                 case ('C'):
                     System.out.println("=========================================================================================================");
                     System.out.println("Enter an amount to withdraw");
                     System.out.println("=========================================================================================================");
                     int amount2 = input.nextInt();
                     withdraw(amount2);
                     System.out.println("\n");
                     break;

                 case ('D'):
                     System.out.println("=========================================================================================================");
                     getPreviousTransaction();
                     System.out.println("=========================================================================================================");
                     System.out.println("\n");
                     break;

                 case ('E'):
                     System.out.println("*********************************************************************************************************");
                                  break;
                 default:
                     System.out.println("Invalid option! please enter a new command again.");
                     break;


             }
        } while (option != 'E');
        System.out.println("Thank you for using our service!");
    }
}






