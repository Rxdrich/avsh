package com.angelrodriguez.avsh;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class testAlien {

    private Aliens alien;

    @Before
    public void setUp() {
        // Initialize an Alien 
        alien = new Aliens("Xorg", 100, 10, 5, 100); // Name, Health, Damage, RegenerationRate, MaxHealth
    }

    @Test
    public void testRegenerateHealth() {
        alien.takeDamage(20); 
        alien.regenerateHealth(); 
        assertEquals(85, alien.getHealth()); // 80 + 5 = 85
    }

    @Test
    public void testMaxHealth() {
        alien.regenerateHealth(); // Regenerate health
        assertEquals(100, alien.getHealth()); // Health should not exceed 100, the initial health
    }
}
