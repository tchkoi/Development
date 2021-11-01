package ge.tchkoi.exercises;

import java.util.Random;
import java.util.Scanner;

public class RandomExercises {
    public static void svastika() {
        int count = 0;
        while (true) {
            Random random = new Random();
            int number = random.nextInt(2);
            System.out.println(number);
            if (number == 0) {
                count++;
            } else count = 0;
            if (count == 3) {
                break;
            }
        }
    }

    public static void roulette() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();
        int rouletteNumber = random.nextInt(36);
        System.out.println(rouletteNumber);
        if (number == rouletteNumber) {
            System.out.println("You Win");
        } else System.out.println("You Lose");

    }

    public static void playerOnRoulette() {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        while (balance > 0) {
            System.out.println("Your balance is " + balance + " $ ");
            System.out.print("Choose your bet - ");
            int bet = scanner.nextInt();
            System.out.print("Choose your number - ");
            int number = scanner.nextInt();
            Random random = new Random();
            int rouletteNumber = random.nextInt(36);
            System.out.println("Number is " + rouletteNumber);
            if (number == rouletteNumber) {
                System.out.println("You Won");
                balance += bet;
            } else {
                System.out.println("You Lose");
                balance -= bet;
            }
        }
    }
}
