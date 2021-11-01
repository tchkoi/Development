package com.company;

public class Main {

    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());
        VipCustomer customer2 = new VipCustomer("Jake", 500.00);
        System.out.println(customer2.getName());
        VipCustomer customer3 = new VipCustomer("Samuel", 15000, "email@samuel.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());
    }
}
