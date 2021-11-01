package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        System.out.println("*************************");
        System.out.println(isPrime(1991710771));


        for (int i= 0; i < 5; i ++) {
        System.out.println("Loop " + i + " world ");
        }

        for (int i =2; i < 9; i ++ ) {
            System.out.println("10000 at " + i + " % interest = " + calculateInterest(10000.0, i ));
        }
        System.out.println("*********");

        for (int i =8; i >= 2; i -- ) {
            System.out.println("10000 at " + i + " % interest = " + calculateInterest(10000.0, i ));
        }

        int count =0;
        for (int i = 10; i< 50; i ++){
            if (isPrime(i)){
                count ++;
                System.out.println("Number " + i + " is a prime number ");
                if (count == 4) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

        public static boolean isPrime (int n) {
            if (n == 1) {
                return false;
            }
            for (int i = 2; i <= n/2; i ++ ) {
                if (n % i == 0) {
                    return false;
                }
            } return true;
        }

        public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
