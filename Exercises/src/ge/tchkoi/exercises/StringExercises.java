package ge.tchkoi.exercises;

import java.util.Locale;
import java.util.Scanner;

public class StringExercises {
    public static void symbolsInText() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char symbol = scanner.nextLine().charAt(0);
        int sumSymbol = 0;
        for (int i = 0; i < text.length(); i++) {
            if (symbol == text.charAt(i)) {
                sumSymbol++;
            }
        }
        System.out.println(sumSymbol);
    }

    public static void mostFrequentSymbol() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int max = 0;
        char maxChar = 'A';
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int sumSymbol = 0;
            for (int j = 0; j < text.length(); j++) {
                if (symbol == text.charAt(j)) {
                    sumSymbol++;
                }
            }
            if (sumSymbol > max) {
                max = sumSymbol;
                maxChar = symbol;
            }
        }
        System.out.println("Most frequent symbol is " + maxChar + " and it's used for " + max + " times");
    }

    public static void isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int forward = 0;
        int backward = text.length() - 1;
        boolean palindrome = true;
        while (backward > forward) {
            if (text.charAt(forward++) != text.charAt(backward--)) {
                palindrome = false;
                System.out.println("this is not palindrome");
                break;
            }
        }
        if (palindrome) {
            System.out.println("this is palindrome");
        }
    }

    public static void symbolStatistics() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase(Locale.ROOT);
        for (char i = 'a'; i <= 'z'; i++) {
            char symbol = i;
            int sumSymbol = 0;
            for (int j = 0; j < text.length(); j++) {
                if (symbol == text.charAt(j)) {
                    sumSymbol++;
                }
            }
            System.out.println("the symbol " + symbol + " in text is for " + sumSymbol + " times");
        }
    }
    public static void stringToInteger () {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < number.length() ; i++) {
            char j = number.charAt(i);
            int digit = j - '0';
            result +=digit;
            result *= 10;
        }
        result /= 10;
        System.out.println(result);

    }
}
