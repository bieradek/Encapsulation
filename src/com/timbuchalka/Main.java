package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player();
        player1.name = "Tim";
        player1.health = 100;
        player1.weapon = "Hatchet";

        int damage = 10;
        player1.loseHealth(damage);
        System.out.println("Remaining health " + player1.healthRemaining());

        damage = 11;
        player1.loseHealth(damage);
        System.out.println("Remaining health " + player1.healthRemaining());
    }
}
