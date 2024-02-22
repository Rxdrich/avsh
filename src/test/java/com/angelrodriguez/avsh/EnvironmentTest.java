package com.angelrodriguez.avsh;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnvironmentTest {

    private Environment environment;

    @Before
    public void setUp() {
        // Initialize the environment with a fixed size before each test
        environment = new Environment(10, 10);
    }

    @After
    public void tearDown() {
        
    }
    
    @Test
    public void testDistanceCalculation() {
        // Assuming a grid where each cell is 1 unit apart
        double distance = environment.calculateDistance(0, 0, 3, 4);
        assertEquals(5.0, distance, 0.01); // 3-4-5 triangle, expecting distance to be 5 with a delta of 0.01
    }
    
    @Test
    public void testEntityInteraction() {
        Human human = new Human("John", 100, 10, 5);
        Aliens alien = new Aliens("Xorg", 90, 12, 3, 120);
        environment.addEntity(0, 0, human);
        environment.addEntity(0, 1, alien);

   
        assertTrue(alien.getHealth() < 100);
    }
    

}

