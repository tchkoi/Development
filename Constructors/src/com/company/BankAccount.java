package com.company;

public class BankAccount {
    private String number;
    private double balance;
    private String phoneNumber;
    private String customerName;
    private String email;

    public BankAccount () {
        this("534423",150,"Default Number","default Name", "Default Email");
    }

    public BankAccount (String number, double balance, String phoneNumber, String customerName, String email) {
        System.out.println("Account constructor is being called");
            this.number = number;
            this.balance = balance;
            this.phoneNumber = phoneNumber;
            this.customerName = customerName;
            this.email = email;
    }

    public void deposit (double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    public void withdrawal (double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + "processed. Remaining balance = " + this.balance);
        }
    }

    public String getAccountNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }

    public void setAccountNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
