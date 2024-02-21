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
	}
	
	public void dealDamage(Entity entity) {
		entity.takeDamage(damage);
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
	
}
	
	
	
	
