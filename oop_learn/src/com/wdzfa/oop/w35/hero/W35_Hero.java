package com.wdzfa.oop.w35.hero;

public class W35_Hero {
    
    private String name;
    private double health;

    public W35_Hero (String name, double health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return this.name;
    }

    public double getHealth(){
        return this.health;
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
    }

    // abstract void attack(W35_Hero enemy); // kalo ini diemplementasikan = public abstract class W35_hero
}
