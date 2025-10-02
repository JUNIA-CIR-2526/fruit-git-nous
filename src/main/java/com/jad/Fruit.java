package com.jad;

public abstract class Fruit {
    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final String name;
}
