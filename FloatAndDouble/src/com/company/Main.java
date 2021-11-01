package com.company;

public class Main {

    public static void main(String[] args) {

            float minFloatValue = Float.MIN_VALUE;
            float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + minFloatValue);
        System.out.println("Float Maximum Value = " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + minDoubleValue);
        System.out.println("Double Maximum Value = " + maxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " +convertedKilograms);



    }
}
