package com.angelrodriguez.avsh;

public class Human extends Entity {
	private int armor;

	public Human(String name, int health, int damage, int armor) {
		super(name, health, damage);
		this.setArmor(armor);
	}

	@Override
	public void takeDamage(int damage) {
		int reducedDamage = damage - armor;
		super.takeDamage(reducedDamage > 0 ? reducedDamage : 0);
	}
		
    @Override
    public void activateSkill() {
        
    }

    public void eatFood() {
        
    }
	
	// getter and setter for armor
	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

}
