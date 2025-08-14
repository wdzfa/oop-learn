package com.wdzfa.oop.w26.hero;

// superclass abstract
public abstract class W26_Hero {
    
    public String name;
    private int level;

    public W26_Hero(String name){
        this.name = name;
        this.level = 1;
    }

    public void display(){
        System.out.println("Aku adalah " + this.name);
        System.out.println("Level: " + this.level);
    }

    // abstract method
    public abstract void levelUp();

    public void setLevel(int deltaLevel){
        this.level += deltaLevel;
    }
}
