package com.angelrodriguez.avsh;


public class Environment {
    public void simulateBattle(Human human, Aliens alien) {
        System.out.println("Battle starts between " + human.getName() + " and " + alien.getName() + ".");
        int round = 1;
        while (human.getHealth() > 0 && alien.getHealth() > 0) {
            System.out.println("Round " + round + ":");
            if (round % 2 == 0) {
                human.activateSkill(); // Human activates skill on even rounds
            } else {
                alien.activateSkill(); // Alien activates skill on odd rounds
            }
            human.dealDamage(alien);
            if (alien.getHealth() > 0) { // Alien only acts if still alive
                alien.regenerateHealth();
                alien.dealDamage(human);
            }
            round++;
        }

        if (human.getHealth() <= 0) {
            System.out.println(alien.getName() + " wins!");
        } else {
            System.out.println(human.getName() + " wins!");
        }
    }
}



