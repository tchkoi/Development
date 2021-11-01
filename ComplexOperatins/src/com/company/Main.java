package com.company;

public class Main {

    public static void main(String[] args) {
	ComplexNumber one = new ComplexNumber(1.0,1.0);
	ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add (1,1);
        System.out.println("one.Real = " + one.getReal());
        System.out.println("one.Imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.Real = " + one.getReal());
        System.out.println("one.Imaginary = " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.Real = " + number.getReal());
        System.out.println("number.Imaginary = " + number.getImaginary());
    }
}
