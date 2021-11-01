package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount lukasAccount = new BankAccount (); //("12345", 0.00, "552332133", "Luka",
                // "myemail@luka.com");
        System.out.println(lukasAccount.getAccountNumber());
        System.out.println(lukasAccount.getBalance());


    lukasAccount.withdrawal(150);
    lukasAccount.deposit(50.0);
    lukasAccount.withdrawal(50);
    lukasAccount.deposit(51.0);
    lukasAccount.withdrawal(100.0);
    }


}
