package com.angelrodriguez.avsh;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

    private Item item;

    @Before
    public void setUp() {
        // Initialize an Item object before each test
        item = new Item("Healing Potion", "Potion", 50);
    }

    @Test
    public void testNameGetter() {
        // Test that the name getter returns the correct name
        assertEquals("Healing Potion", item.getName());
    }

    @Test
    public void testTypeGetter() {
        // Test that the type getter returns the correct type
        assertEquals("Potion", item.getType());
    }

    @Test
    public void testEffectValueGetter() {
        // Test that the effect value getter returns the correct value
        assertEquals(50, item.getEffectValue());
    }
}
