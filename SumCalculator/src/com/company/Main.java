package com.company;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(27);
        calculator.setSecondNumber(9);
        System.out.println("Add = " + calculator.getAdditionResult());
        System.out.println("Divide = " + calculator.getDivisionResult());
        System.out.println("Subtract = " + calculator.getSubtractionResult());
        System.out.println("Multiply = " + calculator.getMultiplicationResult());
    }
}
