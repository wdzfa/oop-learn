package com.wdzfa.oop.w30;

public class W30_Hero {
    
    private String name;
    private double health;

    W30_Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    void display(){
        System.out.println("name: " + this.name + " health: " + this.health);
    }

    void setName(String name){
        this.name = name;
    }
}
