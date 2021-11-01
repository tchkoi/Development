package com.company;

public class Main {

    public static void main(String[] args) {
        double firstValue = 20;
        double secondValue = 80;
        double totalValue = (firstValue + secondValue) * 100;
        System.out.println(totalValue);
        double inRemainder = totalValue % 60;
        System.out.println(inRemainder);
        boolean lastRemainder = inRemainder == 0;
        System.out.println(lastRemainder);
        if (!lastRemainder) {
            System.out.println("There is some problem");
        }
    }
}
