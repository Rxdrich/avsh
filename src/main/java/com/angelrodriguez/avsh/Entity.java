package com.angelrodriguez.avsh;

public abstract class Entity {
    protected String name;
    protected int health;
    protected int damage;

    public Entity(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " takes " + damage + " damage. Remaining health: " + health);
    }

    public void dealDamage(Entity entity) {
        entity.takeDamage(damage);
        System.out.println(name + " deals " + damage + " damage to " + entity.getName());
    }
	
	public abstract void activateSkill();
	
	
	// getter and setter for name, health, damage
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getDamage() {
		return damage;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}

	protected abstract void increaseHealth(int healingAmount);

	public boolean isAlive() {
		return this.health > 0;
	}

	public void attack(Entity target) {
	    if (target != null && target.isAlive()) {
	        target.takeDamage(this.damage);
	        System.out.println(this.getName() + " attacks " + target.getName() + " for " + this.damage + " damage.");
	    }
	}
	
	public void takeDamage() {
	    this.health -= damage;
	    if (this.health < 0) {
	        this.health = 0; 
	    }
	}	
	
}
	
	
	
	
