package com.company;

public class Main {

    public static void main(String[] args) {

        short shortValue = 10;
        byte byteValue = 30;
        int intValue = 50;

        long longTotal = 5000L + 10L * (byteValue + intValue +shortValue);
        System.out.println(longTotal);

        short shortTotal = (short) (5000 + 10 * (byteValue + intValue + shortValue));
        System.out.println(shortTotal);
    }
}
