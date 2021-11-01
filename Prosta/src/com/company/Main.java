package com.company;

public class Main {

    public static void main(String[] args) {
	int score = 500;
	if (score > 1000) {
        System.out.println("Your score is more than 1000");
    }
	else if (score <1000 && score >200) {
        System.out.println("Your score is more than 200, but less than 1000");
    }
	else
        System.out.println("Your score is less than 200");
    }
}
