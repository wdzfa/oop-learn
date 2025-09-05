package com.wdzfa.oop.w33.hero;

public abstract class W33_Hero {
    
    private String name;
    private double health;

    W33_Hero (String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
    }
}
