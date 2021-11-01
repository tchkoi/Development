package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int [] baseData = new int [10];

    public static void main(String [] args) {
        System.out.println("Enter 10 Integers");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 Integers");
        getInput();
        printArray(baseData);
    }
    private static void getInput () {
        for (int i = 0; i < baseData.length; i++) {
            baseData [i] = scanner.nextInt();
        }
    }
    private static void printArray (int [] array) {
        for (int i = 0; i < baseData.length; i++) {
            System.out.print(array[i] + " " );
        }
        System.out.println();
    }
    private static void resizeArray () {
        int [] newArray = baseData;

        baseData = new int [12];
        for (int i = 0; i < newArray.length; i++) {
            baseData[i] = newArray[i];
        }
    }
}
