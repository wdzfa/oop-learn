package com.wdzfa.oop.w32.hero;

public abstract class W32_Hero {
    
    private String name;
    private double health;


    W32_Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
    }
}
