package com.angelrodriguez.avsh;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class testHuman {

    private Human human;

    @Before
    public void setUp() {
        // Initialize a Human object
        human = new Human("Angel", 100, 50, 5); // Name, Health, Damage, Armor
    }

    @Test
    public void testArmorReduction() {
        // Simulate taking damage to test armor reduction
        human.takeDamage(15); // Should reduce damage by armor value
        assertEquals(90, human.getHealth()); // 100 - (15 - 5) = 90
    }

    @Test
    public void testEatFood() {
        // Test eating food increases health
        human.eatFood(20); // Eat food to regain 20 health
        assertEquals(120, human.getHealth()); // 100 + 20 = 120
    }
}
