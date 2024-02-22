package com.angelrodriguez.avsh;

public class Cell<Item> {
    private Entity entity;
    private Item item;

    public Cell() {
        this.entity = null;
        this.item = null;
    }

    public boolean isEmpty() {
        return entity == null && item == null;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

