package com.angelrodriguez.avsh;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testEntity {
    
	@Test
    public void testEntityInstantiation() {
        // Create an entity object
        Entity entity = new EntityImpl("TestEntity", 100, 10);
        
        // Check if the object is instantiated correctly
        assertEquals("TestEntity", entity.getName());
        assertEquals(100, entity.getHealth());
        assertEquals(10, entity.getDamage());
    }
    
    // Inner class for testing purposes
    private class EntityImpl extends Entity {
        public EntityImpl(String name, int health, int damage) {
            super(name, health, damage);
        }
        
        @Override
        public void activateSkill() {
            System.out.println(getName() + " activates their skill, increasing damage temporarily.");
            this.damage += 10; // Increase damage by 10 temporarily
        }

		@Override
	    protected void increaseHealth(int healingAmount) {
	        this.health += healingAmount;
	        System.out.println(getName() + " heals for " + healingAmount + " points. Current health: " + this.health);
	    }
    }
}

