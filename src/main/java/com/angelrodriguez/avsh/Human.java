package com.angelrodriguez.avsh;

public class Human extends Entity {
    private int armor;

    public Human(String name, int health, int damage, int armor) {
        super(name, health, damage);
        this.armor = armor;
    }

    @Override
    public void takeDamage(int damage) {
        // Incoming damage is reduced by armor before being applied
        super.takeDamage(Math.max(damage - armor, 0));
    }

    @Override
    public void activateSkill() {
        // Example implementation: Boost armor
        this.armor += 5;
        System.out.println(getName() + " has activated their skill to increase armor to " + armor);
    }

    public void eatFood(int healthGain) {
        // Increase health
        this.health += healthGain;
        System.out.println(getName() + " has eaten food and regained " + healthGain + " health.");
    }
    
	// getter and setter for armor
	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

}
