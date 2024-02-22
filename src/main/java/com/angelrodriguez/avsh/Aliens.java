package com.angelrodriguez.avsh;

public class Aliens extends Entity {
	
    private int regenerationRate;
	private int maxHealth;

    public Aliens(String name, int health, int damage, int regenerationRate, int maxHealth) {
        super(name, health, damage);
        this.regenerationRate = regenerationRate;
        this.maxHealth = maxHealth;
    }

    @Override
    public void activateSkill() {
        // Implementation of an alien-specific skill
        System.out.println(getName() + " activates a crunchy skill!");
    }

    public void regenerateHealth() {
        // Increase health by the regeneration rate without exceeding maxHealth
        this.health = Math.min(this.health + regenerationRate, maxHealth);
        System.out.println(getName() + " regenerates " + regenerationRate + " health. Current health: " + health);
    }

    public void mutate() {
        System.out.println(name + " mutates and gains new abilities!");
        regenerationRate += 2; 
        damage += 2; 
    }

    @Override
    protected void increaseHealth(int healingAmount) {
        
        this.health += healingAmount;

        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }

        System.out.println(this.name + " has increased health by " + healingAmount + ". Current health: " + this.health);
    }


}
