package com.angelrodriguez.avsh;

public class Aliens extends Entity {
	
    private int regenerationRate;

    public Aliens(String name, int health, int damage, int regenerationRate) {
        super(name, health, damage);
        this.regenerationRate = regenerationRate;
    }

    @Override
    public void activateSkill() {
        System.out.println(name + " activates a crunchy skill!");
        damage += 5;
        System.out.println(name + "'s damage is temporarily increased to " + damage);
    }

    public void regenerateHealth() {
        health += regenerationRate;
        System.out.println(name + " regenerates " + regenerationRate + " health. Total health: " + health);
    }

    public void mutate() {
        System.out.println(name + " mutates and gains new abilities!");
        regenerationRate += 2; 
        damage += 2; 
    }

}
