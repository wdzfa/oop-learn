package com.wdzfa.oop.w31;

public class W31_Hero {
    
    private String name;
    private double health;

    W31_Hero (String name, double health){
        this.name = name;
        this.health = health;
    }

    void display(){
        System.out.println("This is " + this.name + " health: " + this.health);
    }

    void setName(String name){
        this.name = name;
    }

    public String toString(){ // ini method yang relate dengan ArrayList untuk print value
        return "Hero: " + this.name;
    }
}
