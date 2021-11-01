package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
        //      player.health = 20;
//        player.name = "Tchkoi";
        //       player.weapon = "Bazooka";
//
        //       int damage = 10;
        //       player.loseHealth(damage);
        //       System.out.println("Remaining health = " + player.healthRemaining());

        //      damage = 11;
        //      player.health = 200;
        //      player.loseHealth(damage);
        //     System.out.println("Remaining health = " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Tchkoi",60,"Bazooka");
        System.out.println("Initial health is " + player.getHealth());

    }
}
