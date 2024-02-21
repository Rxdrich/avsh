package com.angelrodriguez.avsh;

public class Aliens extends Entity {
	private int regenerationRate;

	public Aliens(String name, int health, int damage, int regenerationRate) {
		super(name, health, damage);
		this.regenerationRate = regenerationRate;
	}
	
    @Override
    public void activateSkill() {
        
    }

    public void regenerateHealth() {
        this.health += regenerationRate;
    }

    public void mutate() {
        
    }

}
