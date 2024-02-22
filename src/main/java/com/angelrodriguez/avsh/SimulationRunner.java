package com.angelrodriguez.avsh;

public class SimulationRunner {

    public static void main(String[] args) {
        Environment environment = new Environment(10, 10); // Example size

        Human human = new Human("John", 100, 10, 5);
        Aliens alien = new Aliens("Xorg", 100, 15, 3, 120);

        environment.addEntity(0, 0, human);
        environment.addEntity(0, 1, alien);

        // Assuming there's a method to start the simulation or to make entities interact
        environment.simulateBattle(); // This method needs to be implemented based on your project's logic
    }
}
