package com.angelrodriguez.avsh;

import java.util.ArrayList;
import java.util.List;

public class Environment {
    @SuppressWarnings("rawtypes")
	private Cell[][] grid;
    private int width;
    private int height;
    private List<Entity> entities = new ArrayList<>();
    
    // Constructor initializing the grid to a specific size
    public Environment(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new Cell[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] = new Cell<>();
            }
        }
    }

    // Method to add an entity to a specific cell
    public void addEntity(int x, int y, Entity entity) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            grid[x][y].setEntity(entity);
        }
    }

    // Method to remove an entity from a cell
    public void removeEntity(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height && grid[x][y].getEntity() != null) {
            grid[x][y].setEntity(null);
        }
    }

    // Method to calculate distance between two entities
    public double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void simulateBattle() {
        System.out.println("Battle simulation starts!");
        while (!isBattleOver()) {
            for (Entity entity : new ArrayList<>(entities)) { 
                if (entity.isAlive()) {
                    Entity target = findTargetFor(entity);
                    if (target != null) {
                        entity.attack(target);
                        System.out.println(entity.getName() + " attacks " + target.getName());
                        if (!target.isAlive()) {
                            System.out.println(target.getName() + " is defeated!");
                            entities.remove(target); 
                        }
                    }
                }
            }
            
        }
        System.out.println("Battle simulation ends!");
    }

    private boolean isBattleOver() {
        boolean humansExist = entities.stream().anyMatch(e -> e instanceof Human && e.isAlive());
        boolean aliensExist = entities.stream().anyMatch(e -> e instanceof Aliens && e.isAlive());
        return !(humansExist && aliensExist); 
    }

    private Entity findTargetFor(Entity entity) {
        
        for (Entity target : entities) {
            if (entity.isAlive() && target.isAlive() && !entity.getClass().equals(target.getClass())) {
                return target; 
            }
        }
        return null; 
    }
}






