package com.angelrodriguez.avsh;

public class alienTest {
    public static void main(String[] args) {
        Aliens alien = new Aliens("Crunchy", 100, 12, 3);
        alien.regenerateHealth();
        System.out.println("Alien's health after regeneration: " + alien.getHealth());
    }
}
