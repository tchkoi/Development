package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 325235 + 3242343;
        System.out.println("Result is = " +result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 2353;
        System.out.println("Result is = " + result);
        System.out.println(previousResult);
        result = result -3565025;
        System.out.println(result);
        result = result * 2;
        System.out.println("200 * 2 = " + result);
        result = result / 4;
        System.out.println("400 / 4 = " + result);

        result = result % 40;
        System.out.println("100 % 40 = " + result);

        result++;
        System.out.println("20 + 1 = " + result);

        result --;
        System.out.println("21 - 1 = " + result);

        result += 4;
        System.out.println("20 + 4 = " + result);

        result *= 10;
        System.out.println("24 * 10 = " + result);

        result /= 3;
        System.out.println("240 / 3 = " + result);

        result /=4;
        System.out.println("80 / 4 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("I am scared of aliens");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100 ");
        }

        if ((topScore >90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50 ) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This not going to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double myValue1 = 20.00d;
        double myValue2 = 80.00d;
        double myTotalValue = (myValue1 + myValue2) * 100;
        System.out.println("My total Value = " + myTotalValue);
        double theRemainder = myTotalValue % 40.00d;
        System.out.println("My reminder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoReminder = " + isNoRemainder);
        if (isNoRemainder = false ) {
            System.out.println("Got some reminder");
        }


    }
}
