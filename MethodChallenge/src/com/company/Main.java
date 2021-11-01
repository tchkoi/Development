package com.company;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Sam", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Roth", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Brandon", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Julien" , highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Samuel" , highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Sharon" , highScorePosition);

    }
     public static void displayHighScorePosition (String playerName, int highScorePosition) {
         System.out.println(playerName + " managed to get into position "
                 + highScorePosition + " on the high score table");
     }
     public static int calculateHighScorePosition (int playerScore) {
 //       if (playerScore >= 1000 ) {
 //           return 1;
 //       } if (playerScore >= 500) {
 //           return 2;
 //        } if (playerScore >= 100) {
 //            return 3;
 //        }
 //        return 4;
         int position = 4;
         if (playerScore >= 1000 ) {
             position = 1;
         }  else if (playerScore >= 500) {
             position = 2;
         }  else if (playerScore >= 100); {
             position = 3;
         }
         return position;
     }
}
