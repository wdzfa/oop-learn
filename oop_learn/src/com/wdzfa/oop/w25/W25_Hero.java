package com.wdzfa.oop.w25;

public class W25_Hero {
    
    private String name;
    private double health;

    W25_Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return this.name;
    }

    public double getHealth(){
        return this.health;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHealth(double health){
        this.health = health;
    }

    public void display(){
        System.out.println(this.name + " ia a regular hero");
    }
}
