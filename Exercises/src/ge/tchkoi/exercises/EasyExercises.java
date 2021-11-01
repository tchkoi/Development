package ge.tchkoi.exercises;

import java.util.Random;
import java.util.Scanner;

public class EasyExercises {
    public static void printSum() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    public static void printDivisors() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = getDivisorsCount(number);
        System.out.println("Divisors = " + counter);
    }

    private static int getDivisorsCount(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter += 1;
            }
        }
        return counter;
    }

    public static void printPower() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("m = ");
        int m = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < m; i++) {
            result *= n;
        }
        System.out.println("result = " + result);
    }

    public static void countEven() {
        Scanner scanner = new Scanner(System.in);
        int countEven = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Even count = " + countEven);
    }

    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number = " + fibonacciHelper(number));

    }

    private static int fibonacciHelper(int position) {
        if (position == 0 || position == 1) {
            return 1;
        }
        return fibonacciHelper(position - 1) + fibonacciHelper(position - 2);
    }

    public static void printIsPrime() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number is : " + isPrime(number));
    }

    private static boolean isPrime(int number) {
        return getDivisorsCount(number) == 2;
    }

    public static void allPrimeNumbers() {
        for (int i = 2; i < 1000000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }

        }
    }

    public static void maxNumber() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1);
        } else System.out.println(number2);
    }

    public static void printNSum() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Hello " + i);
        }
    }

    public static void printNWholeSum() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int wholeNumber = scanner.nextInt();
            sum += wholeNumber;
        }
        System.out.println(sum);
    }


}
